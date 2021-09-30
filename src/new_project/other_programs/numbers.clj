(ns new-project.other-programs.numbers)

;;Number functions
(defn numbers []
  (def x 5)
  (println (type x))
  (def x (zero? 0))
  (println x)
  (def x (pos? -1))
  (println x)(def x (neg? -1))
  (println x)
  (def x (even? 2))
  (println x)
  (def x (number? :a))
  (println x)
  (def x (number? :a))
  (println x)
  (def x (integer? :a))
  (println x)
  (def x (float? 0.0))
  (println x))

(numbers)