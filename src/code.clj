(ns code
  (:require [prot]
            [data])
  )

(defn getstr [data]
  (str (prot/dothing1 data) (prot/dothing2 data)))


