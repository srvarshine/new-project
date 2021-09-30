(ns new-project.repl-labs.lab4-common-operations)
; Do all work in this file, then use (Option+Shift+P) to send the current
;  highlighted statement to the REPL

; Make sure your REPL is launched and switch to this file's namespace (Option+Shift+R).
; Now load the file into the REPL (Option+Shift+L).

(def test-map {:title "Some Book"
               :author "Fred"
               :genre "Nonfiction"
               :chapters {1 "Introduction"
                          2 "Middle"
                          3 "End"}})
(def test-set #{1 3 4 7 11 14})
(def test-vector ["red" "orange" "yellow" "green" "blue" "purple" "brown" "grey"])
(def test-list '(4.7 8.2 7.7 13.6 8.1))
(def test-map2 {:title "Some book"
                :cost  10.0})

; 1. Getting values from data structures
; a. Use (select-keys) to get a map containing just the title and author from test-map
(println (select-keys test-map [:title :author]))
; b. Use (get-in) to get the title of chapter 2 from test-map
(println (get-in test-map [:chapters 2]))
; c. Use (into) or (merge) to merge test-map with test-map2, keeping the title from test-map
(println (merge test-map test-map2))
; d. Use (first) to get the first element from a structure.  Try on each different data structure.
(println (first test-list))
(println (first test-vector))
(println (first test-set))
(println (first test-map))
; e. Use (nth) to get the 3rd element from a structure.  This is 1-based.  Try on test-vector and test-list.
(println (nth test-list 2))
(println (nth test-vector 2))
; f. Use (get) or the keyword function itself to retrieve the title from test-map
(println (get test-map :title))
; 2. Adding/removing from data structures
; Remember, all clojure types are immutable.  None of these operations change the defs above.
; a. Use (conj) to add the value 1 to both the test-list and test-vector. Notice the difference.
;    conj uses the most efficient method of adding elements to a given collection.
(println (conj test-list 1))
(println (conj test-vector 1))
; b. Use (into), (merge) and/or (conj) to merge test-map and test-map2, keeping the title from test-map
(println (into test-map test-map2))
(println (conj test-map test-map2))
; c. Use (assoc) to add :pages 200 to test-map
(def new-test-map (assoc test-map :pages 200))
(println new-test-map)
; d. Use (disj) to remove an element from a test-set
(println (disj test-set 11))
; e. Use (dissoc) to remove the :chapters information from test-key
(def test-key (dissoc test-map :chapters))
(println test-key)
; 3. Other data manipulation
; a. Use (filter) to select values from test-list greater than 8.0
(println (filter (fn [x] (> x 8)) test-list))
; b. Use (partition) to partition test-vector into groups of 2 elements
(println (partition 2 test-vector))
; c. Use (group-by) to group the colors in test-vector by their first letter
(println (group-by first test-vector))
; d. Use (map) to get a sequence of all of the values from test-set incremented by 1
(println (map (fn [x] (inc x)) test-set))
; e. Use (reduce) to get the sum of all the values in test-set
(println (reduce + test-set))
; f. Use (some) to find the first value greater than 8 in test-list
(println (some #(if (> % 8) %) test-set))
; 4. Threading macro
; In the previous sections, we learned how to manipulate data structures using
;  single function calls.  However, most applications are doing much more complex
;  data manipulations that involves nesting multiple function calls to achieve the
;  result you need.  This is where threading macros become important.
; (->) is the thread-first macro which will take the result of the first evaluation,
;  then threads that result as the first argument to the next evaluation, and that
;  threading continues to the end
; (->>) is the thread-last macro which does the same except it threads the result as the
;  last argument to each evaluation

; Consider the following evaluation which takes the first 4 items from the list,
;  squares them, then adds them together
(reduce + (map #(* % %) (take 4 test-list)))
; Rewrite the above code using the thread-last macro
; Pay attention to the readability difference before and after
(defn sum-of-squares []
  (->>(take 4 test-list)
      (map #(* % %) ,,,)
      (reduce + ,,,)) )
(print (sum-of-squares))