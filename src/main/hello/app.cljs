(ns hello.app
  (:require [reagent.dom :as rdom]))

(defn theme-toggle-field []
  [:input.theme-switch {:type "checkbox"
                        :id   "theme-switch"}])

(defn theme-toggle-label []
  [:label.switch-label {:for "theme-switch"}])

(defn page []
  [:<>
   [theme-toggle-field]
   [:div#page
    [theme-toggle-label]]])

(defn main-element []
  (-> js/document (.getElementById "app")))

(defn ^:export main []
  (rdom/render [page] (main-element)))
