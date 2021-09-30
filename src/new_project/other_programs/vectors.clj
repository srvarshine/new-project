(ns new-project.other-programs.vectors)
(defn vector-operation []
  (def x (vector 1 2 3))
  (println x)
  (println (nth x 1))
  (println (get x 1))
  (println (vector-of :int 1 2 3))
  (println (conj x 5))
  (println (pop x))
  (println (subvec (vector 1 2 3 4 5 6 7) 2 5)))

(vector-operation)