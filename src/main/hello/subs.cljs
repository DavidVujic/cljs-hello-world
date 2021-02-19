(ns hello.subs
  (:require [re-frame.core :as rf]))

; Defining shorthands for re-frame subscribe
(def <sub (comp deref rf/subscribe))

(rf/reg-sub
 :dark-theme?
 (fn [db _]
   (= "dark" (get-in db [:theme :active]))))

(rf/reg-sub
 :light-theme?
 :<- [:dark-theme?]
 (fn [dark-theme? _]
   (not dark-theme?)))
