(ns hello.events
  (:require [re-frame.core :as rf]))

; Defining shorthands for re-frame dispatch
(def >evt rf/dispatch)

(rf/reg-event-db
 :toggle
 (fn [db [_ checked?]]
   (assoc-in db [:theme :toggle :checked?] checked?)))

(rf/reg-event-fx
 :init
 (fn [_ _]
   {:dispatch [:toggle true]}))

(rf/reg-event-fx
 :toggle-theme
 (fn [_ [_ checked?]]
   {:dispatch [:toggle (not checked?)]}))
