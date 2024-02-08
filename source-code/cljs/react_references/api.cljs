
(ns react-references.api
    (:require [react-references.env :as env]
              [react-references.side-effects :as side-effects]
              [react-references.state :as state]
              [react-references.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial How to use?
;
; @code Demo
; [:div {:ref (set-reference-f :my-div)} "My div"]
;
; [:button {:on-click #(-> :my-div get-reference .-style (set! "background-color: red"))}
;          "Change background color"]
; @---

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (react-references.env/*)
(def get-reference env/get-reference)

; @redirect (react-references.side-effects/*)
(def set-reference! side-effects/set-reference!)

; @redirect (react-references.state/*)
(def REFERENCES state/REFERENCES)

; @redirect (react-references.utils/*)
(def set-reference-f utils/set-reference-f)
