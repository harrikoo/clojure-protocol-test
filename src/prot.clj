(ns prot
  )

(defprotocol Prot1
  (dothing1 [me] "Do first thing")
  )

(defprotocol Prot2
  (dothing2 [me] "Do the second thing")
  (dothing2a [me] "Second thing, with a catch")
  )
