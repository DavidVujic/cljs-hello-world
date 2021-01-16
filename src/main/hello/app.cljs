(ns hello.app
  (:require [reagent.dom :as rdom]))

(defn hello-world []
  "Hello World.")

(defn theme-toggle-field []
  [:input.theme-switch {:type "checkbox"
                        :id   "theme-switch"}])

(defn theme-toggle []
  [:label.switch-label {:for "theme-switch"}])

(defn greeting []
  [:<>
   [:h1 "Good Morning"]
   [:p "This is Hiccup."]])

(defn page []
  [:<>
   [theme-toggle-field]
   [:div#page
    [theme-toggle]
    [greeting]]])

(defn ^:export run []
  (rdom/render [page] (js/document.getElementById "root")))
