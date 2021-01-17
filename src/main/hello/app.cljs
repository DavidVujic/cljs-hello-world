(ns hello.app
  (:require [reagent.dom :as rdom]
            [re-frame.core :as rf]
            [hello.subs :refer [<sub]]
            [hello.events :refer [>evt]]
            ["react-tooltip" :as ReactTooltip]))

(defn hello-world []
  "Hello World.")

(defn theme-toggle-field []
  [:input.theme-switch {:type "checkbox"
                        :id   "theme-switch"
                        :on-change (fn [e] (>evt [:toggle-theme e.target.checked]))}])

(defn theme-toggle-label []
  [:label.switch-label {:for "theme-switch"}])

(defn greeting []
  (let [light? (<sub [:light-theme?])
        dark?  (<sub [:dark-theme?])]
    [:<>
     [:h1 (if dark? "Good Evening." "Good Morning.")]
     [:p {:data-tip "And this is ReactTooltip"}
      "Made with cool tools like Hiccup, Reagent and re-frame"]
     (when light?
       [:p (str " 🌅 " " 😴 " " ☕ ")])]))

(defn page []
  [:div#page
   [theme-toggle-label]
   [greeting]])

(defn tooltip []
  [:> ReactTooltip {:place  "top"
                    :type   "success"
                    :effect "float"}])

(defn main []
  [:<>
   [theme-toggle-field]
   [page]
   [tooltip]])

(defn ^:export run []
  (rf/dispatch-sync [:init])
  (rdom/render [main] (js/document.getElementById "app")))
