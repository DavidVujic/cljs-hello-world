(ns hello.app
  (:require [reagent.dom :as rdom]))

(defn hello-world []
  "Hello World.")

(defn message []
  [:div
   [:h1 "Good Morning"]
   [:p "This is Hiccup."]])

(defn ^:export run []
  (rdom/render [message] (js/document.getElementById "root")))
