(ns core
  (:require [prot]
            [data]
            [tools]
            ; [tools2]
            [code]
            )
(:gen-class)
)

(defn -main [& args]
  (let [d1 (data/->Data1 (first args) "other string")
        ]
    (println (str "Call from core: " (prot/dothing1 d1) (prot/dothing2 d1) args))
    (println (str "Use the function in code.clj: "(code/getstr d1)))
    )
  
  )
