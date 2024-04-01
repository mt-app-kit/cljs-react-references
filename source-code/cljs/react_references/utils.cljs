
(ns react-references.utils
    (:require [react-references.side-effects :as side-effects]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn store-reference-f
  ; @description
  ; Returns a function that stores the given React component reference.
  ;
  ; @param (keyword) reference-id
  ;
  ; @usage
  ; [:div {:ref (store-reference-f :my-reference)}]
  ;
  ; @return (function)
  [reference-id]
  (fn [reference] (side-effects/store-reference! reference-id reference)))
