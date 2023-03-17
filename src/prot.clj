(ns prot
  )

(defprotocol Prot1
  (dothing1 [me] "Do first thing")
  )

(defprotocol Prot2
  (dothing2 [me] "Do the second thing")
  )
