(ns new-project.other-programs.regular-expression)
(defn reg-exp []
  (def pat (re-pattern "\\d+"))
  (println (re-find pat "abc123de"))
  (def newstr1 (clojure.string/replace "abc123de123" pat "789"))
  (def newstr2 (clojure.string/replace-first "abc123de123" pat "789"))
  (println newstr1)
  (println newstr2))
(reg-exp)
