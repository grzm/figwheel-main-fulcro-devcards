(ns com.grzm.ex.fmfd.cards
  (:require
   [devcards.core]
   [fulcro.client.cards :refer [defcard-fulcro]]
   [fulcro.client.dom :as dom]
   [fulcro.client.primitives :as prim :refer [defsc]])
  (:require-macros
   [devcards.core :refer [defcard]]))

(defcard app-card
  "Example card")

(devcards.core/start-devcard-ui!)

(defsc Root [this {:keys [root/message]}]
  {:query [:root/message]
   :initial-state {:root/message "Hello!"}}
  (dom/div :.ui.segments
       (dom/div :.ui.top.attached.segment
                (dom/div :.content
                         "Welcomee to Fulcro!"))
       (dom/div :.ui.attached.segment
            (dom/div :.content
                     (dom/div :.content
                              (dom/div message)
                              (dom/div "Some content here would be nice"))))))


(defcard-fulcro root
  Root
  {}
  {:inspect-data false})
