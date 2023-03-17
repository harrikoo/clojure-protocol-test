(ns tools2
  (:require [data]
            [prot])
  (:import [data Data1])
  )

(extend-protocol prot/Prot2
  Data1
  (dothing2 [this] (str " And '" (:f2 this) "' from tools2"))
  )

