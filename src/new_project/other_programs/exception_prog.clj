(ns new-project.other-programs.exception-prog)
(defn exception-eg []
  (try
    (def string1 (slurp "Example1.txt"))
    (println string1)
    (catch java.io.FileNotFoundException e (println (str "caught file
         exception: " (.getMessage e))))
    (catch Exception e (println (str "caught exception: " (.getMessage e))))
    (finally (println "This is our final block")))
  (println "Let's move on")
  )
(exception-eg)