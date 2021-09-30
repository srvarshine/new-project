(ns new-project.other-programs.decision-making)
;;if
(defn if-eg [] (
   if ( = 2 2)
    (println "Values are equal")
    (println "Values are not equal")))
;;if-do
(defn if-do [] (
   if (= 2 2)
    (do(println "Both the values are equal")
    (println "true"))
    (do(println "Both the values are not equal")
    (println "false"))))
;;nested-if
(defn nested-if [] (
   if ( and (= 2 2) (= 3 3))
   (println "Values are equal")
   (println "Values are not equal")))
;;case
(defn case-statement []
  (def x 5)
  (case x 5  (println "x is 5")
          10 (println "x is 10")
          (println "x is neither 5 nor 10")))
;;cond
(defn cond-statement []
  (def x 5)
  (cond
    (= x 5) (println "x is 5")
    (= x 10)(println "x is 10")
    :else (println "x is not defined")))

(if-eg)
(if-do)
(nested-if)
(case-statement)
(cond-statement)