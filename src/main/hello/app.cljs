(ns hello.app
  (:require [reagent.dom :as rdom]
            [re-frame.core :as rf]
            [hello.subs :refer [<sub]]
            [hello.events :refer [>evt]]))

(defn hello-world []
  "Hello World.")

(defn theme-toggle-field []
  [:input.theme-switch {:type "checkbox"
                        :id   "theme-switch"
                        :on-change (fn [e] (>evt [:toggle-theme e.target.checked]))}])

(defn theme-toggle-label []
  [:label.switch-label {:for "theme-switch"}])

(defn greeting []
  [:<>
   [:h1 (if (<sub [:dark-theme?]) "Good Evening" "Good Morning")]
   [:p "This is Hiccup."]])

(defn page []
  [:div#page
   [theme-toggle-label]
   [greeting]])

(defn main []
  [:<>
   [theme-toggle-field]
   [page]])

(defn ^:export run []
  (>evt [:init])
  (rdom/render [main] (js/document.getElementById "app")))
