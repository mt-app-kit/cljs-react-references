
(ns react-references.utils
    (:require [react-references.side-effects :as side-effects]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn set-reference-f
  ; @description
  ; Returns a function that stores the given DOM Element object as reference in the 'REFERENCES' atom.
  ;
  ; @param (keyword) reference-id
  ;
  ; @usage
  ; [:div {:ref (set-reference-f :my-reference)}]
  ;
  ; @return (function)
  [reference-id]
  (fn [reference] (side-effects/set-reference! reference-id reference)))
