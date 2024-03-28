
(ns react-references.side-effects
    (:require [react-references.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------
 
(defn set-reference!
  ; @description
  ; Stores the given DOM Element object as reference in the 'REFERENCES' atom.
  ;
  ; @param (keyword) reference-id
  ; @param (DOM Element object) reference
  ;
  ; @usage
  ; [:div {:ref #(set-reference! :my-reference %)}]
  [reference-id reference]
  (swap! state/REFERENCES assoc reference-id reference))
