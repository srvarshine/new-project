(ns new-project.other-programs.predicates)
(defn predicates-eg []
  (println ((every-pred number? even?) 2 4 6))
  (println (every? even? '(2 3 6)))
  (println (some even? '(1 2 3 4)))
  (println (not-any? even? '(3 5 7))))

(predicates-eg)