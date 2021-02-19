(ns hello.events
  (:require [re-frame.core :as rf]))

; Defining shorthands for re-frame dispatch
(def >evt rf/dispatch)

(rf/reg-event-db
 :theme
 (fn [db [_ theme]]
   (assoc-in db [:theme :active] theme)))

(rf/reg-event-fx
 :init
 (fn [_ _]
   {:dispatch [:theme "dark"]}))

(rf/reg-event-fx
 :toggle-theme
 (fn [_ [_ checked?]]
   {:dispatch [:theme (if checked? "dark" "light")]}))
