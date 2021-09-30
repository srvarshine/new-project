(ns new-project.other-programs.Loops)

;;while loop
(defn while-loop []
  (def x (atom 1))
  (while ( < @x 5 )
    (do
      (println @x)
      (swap! x inc ))))
;;doesq
(defn doseq-eg []
  (doseq [n [0 1 2]]
    (println n)))
;;do-times
(defn do-times []
  (dotimes [n 5]
    (println n)))
;;loop
(defn loop-eg []
  (loop [x 10]
    (when (> x 1)
      (println x)
      (recur (- x 2)))))

(while-loop)
(doseq-eg)
(do-times)
(loop-eg)