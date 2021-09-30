(ns new-project.other-programs.functions)

;;anonymous function
(defn anonymous-func []
  ((fn [x] (* 2 x)) 2))
;;variadic function
(defn variadic-func [message & others]
  (println (str message (clojure.string/join " " others))) )

(println (filter even? (range 0 10)))
(anonymous-func)
(variadic-func "Hello" "how" "are" "you")