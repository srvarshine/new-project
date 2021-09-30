(ns new-project.other-programs.macros)
(defn macros-eg []
  (defmacro Simple []
    (println "Hello"))
  (macroexpand '(Simple))
  (defmacro Simple1 [arg]
    (list 2 arg))
  (println (macroexpand '(Simple1 1)))
  )
(macros-eg)