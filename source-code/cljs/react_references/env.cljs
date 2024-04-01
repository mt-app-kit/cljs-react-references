
(ns react-references.env
    (:require [common-state.api :as common-state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn get-reference
  ; @description
  ; Returns a stored React component reference.
  ;
  ; @param (keyword) reference-id
  ;
  ; @usage
  ; (get-reference :my-reference)
  ; =>
  ; #object[HTMLDivElement]
  ;
  ; @return (DOM Element object)
  [reference-id]
  (common-state/get-state :react-references reference-id))
