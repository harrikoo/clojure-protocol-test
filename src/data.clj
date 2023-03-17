(ns data
  (:require [prot]
            ))


(defrecord Data1 [f1 f2]
  prot/Prot1
  (dothing1 [this] (str "First argument '" (:f1 this) "' called from data.clj. ")))
