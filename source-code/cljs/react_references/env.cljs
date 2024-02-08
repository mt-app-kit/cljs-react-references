
(ns react-references.env
    (:require [react-references.state :as state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn get-reference
  ; @param (keyword) reference-id
  ;
  ; @usage
  ; (get-reference :my-reference)
  ; =>
  ; #object[HTMLDivElement]
  ;
  ; @return (DOM Element object)
  [reference-id]
  (get @state/REFERENCES reference-id))
  
