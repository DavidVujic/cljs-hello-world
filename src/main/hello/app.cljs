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


















;; (comment
;;   (require '[re-frame.db])
;;   (-> @re-frame.db/app-db))


;; If I get what we in Sweden call "Hjärnsläpp" & forget how to code:

;; :on-change (fn [e] (>evt [:toggle-theme (-> e .-target .-checked)]))

;; don't forget to require [re-frame.core :as rf]
;; (rf/dispatch-sync [:init])

;; (comment
;;   (require '["date-fns" :as date-fns])
;;   (require '[hello.subs :refer [<sub]])

;;   (defn today []
;;     [:p (-> js/Date .now (date-fns/format "EEEE"))])

;;   (defn greeting []
;;     [:h1 (if (<sub [:dark-theme?]) "Good Evening." "Good Morning.")]))
