(ns hello.app
  (:require [reagent.dom :as rdom]))

(defn hello-world []
  "Hello World.")

(defn theme-toggle-field []
  [:input.theme-switch {:type "checkbox"
                        :id   "theme-switch"}])

(defn theme-toggle-label []
  [:label.switch-label {:for "theme-switch"}])

(defn greeting []
  [:<>
   [:h1 "Good Morning"]
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
  (rdom/render [main] (js/document.getElementById "app")))
