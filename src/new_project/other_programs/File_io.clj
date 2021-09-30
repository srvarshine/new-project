(ns new-project.other-programs.File-io)

;;read file as string
(defn read-eg []
  (def string1 (slurp "example.txt"))
  (println string1))
;;Read file line by line
(defn read-line-eg []
  (with-open [rdr (clojure.java.io/reader "example.txt")]
    (reduce conj [] (line-seq rdr))))
;;write contents to file
(defn write-eg []
  (spit "example_output.txt"
        "This is a string"))
;;write files line by line
(defn write-line-eg []
  (with-open [w (clojure.java.io/writer "example_output.txt" :append true)]
    (.write w (str "hello" "world"))))
;;check if file exists
(defn file-exists []
  (println (.exists (clojure.java.io/file "example.txt"))))

(read-eg)
(read-line-eg)
(write-eg)
(write-line-eg)
(file-exists)