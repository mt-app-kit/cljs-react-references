
(ns react-references.side-effects
    (:require [common-state.api :as common-state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn store-reference!
  ; @description
  ; Stores the given React component reference.
  ;
  ; @param (keyword) reference-id
  ; @param (DOM Element object) reference
  ;
  ; @usage
  ; [:div {:ref #(store-reference! :my-reference %)}]
  [reference-id reference]
  (common-state/assoc-state! :react-references reference-id reference))
