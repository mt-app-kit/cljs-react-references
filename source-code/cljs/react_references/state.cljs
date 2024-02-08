
(ns react-references.state)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @description
; Stored DOM Element object references.
;
; @atom (map)
; {:my-reference (DOM Element object)}
;
; @usage
; (deref REFERENCES)
; =>
; {:my-reference #object[HTMLDivElement]}
(def REFERENCES (atom {}))
