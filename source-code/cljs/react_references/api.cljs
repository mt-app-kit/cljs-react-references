
(ns react-references.api
    (:require [react-references.env          :as env]
              [react-references.side-effects :as side-effects]
              [react-references.utils        :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial React References
;
; Designed for storing React component references in atom.

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Demo #1
;
; @usage
; [:div {:ref (store-reference-f :my-div)} "My div"]
;
; [:button {:on-click #(-> :my-div get-reference .-style (set! "background-color: red"))}
;          "Change background color"]

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Demo #2
;
; @usage
; [:div {:ref #(store-reference! :my-div %)} "My div"]
;
; [:button {:on-click #(-> :my-div get-reference .-style (set! "background-color: red"))}
;          "Change background color"]

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (react-references.env/*)
(def get-reference env/get-reference)

; @redirect (react-references.side-effects/*)
(def store-reference! side-effects/store-reference!)

; @redirect (react-references.utils/*)
(def store-reference-f utils/store-reference-f)
