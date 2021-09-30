(ns new-project.other-programs.lists)

(defn list-operations []
  (def x (list 1 2 3 4))
  (println x)
  (println (list 'a 'b 'c 'd))
  (println (list* 1 4 [2,3]))
  (println (first x))
  (println (rest x))
  (println (nth x 2))
  (println (cons 0 x))
  (println (conj x 5 6))
  ;;iterating through list
  (doseq [n x]
    (println n))
  )
(list-operations)
