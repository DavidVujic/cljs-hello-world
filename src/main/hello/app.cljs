(ns hello.app
  (:require [reagent.dom :as rdom]))

(defn theme-toggle-field []
  [:input {:type       "checkbox"
           :class-name "theme-switch"
           :id         "theme-toggle"}])

(defn theme-toggle-label []
  [:label {:class-name "switch-label"
           :for        "theme-toggle"}])

(defn page []
  [:<>
   [theme-toggle-field]
   [:div {:id "page"}
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
