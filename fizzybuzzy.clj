(ns fizzybuzzy
  (:gen-class)
)

(defn fizzbuzz [number]
  "fizzbuzz using only two conditional checks and tail recursion"
  (clojure.string/join ((fn [n rez] 
    (cond 
      (zero? (mod n 3)) (recur (/ n 3) (conj rez "fizz"))
      (zero? (mod n 5)) (recur (/ n 5) (conj rez "buzz"))
      :else rez
    )
  ) number #{}))
)

(run! (fn [n] (println n  (fizzbuzz n))) (range 1 101))
