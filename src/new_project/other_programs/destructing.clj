(ns new-project.other-programs.destructing)
(defn destructing-eg []
  (def my-vector [1 2 3 4])
  (let [[a b c d e] my-vector]
    (println a b c d e))
  (let [[a b & the-rest] my-vector]
    (println a b the-rest))
  (def my-map {"a" 1 "b" 2})
  (let [{a "a" b "b" c "c"} my-map]
    (println a b c)))

(destructing-eg)