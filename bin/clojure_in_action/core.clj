(ns clojure-in-action.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn my-add [op1 op2] (+ op1 op2))
(my-add 1 2)

; cond
(defn cmp [op1 op2]
  (cond
    (> op1 op2) (println "greater")
    (< op1 op2) (println "lesser")
    :default (println "equal")))
(cmp 2 1)
    
; let
(let [quoted-list '(add 1 2 3)]
  quoted-list)

; when
(when (> 1 0)
  (println "hello")
  (println "world"))

; loop and recur
(defn fact [n]
  (loop [current n 
         val 1]
    (if (= current 1)
      val
      (recur (dec current) (* val current)))))
(println (fact 10))

; for - list comprehension
(defn chess-labels []
  (for [alpha "abcdefgh"
        num (range 1 20)
        :when (< num 9)]
    (str alpha num)))
(chess-labels)

; Java string ops
(.split "hello world" " ")

; ISeq interface
