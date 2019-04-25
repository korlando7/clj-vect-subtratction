(ns clj-vect-subtraction.core
  (:gen-class))

(defn update-freqs [m val]
  (let [count (get m val)]
    (if (and count (pos? count)) (assoc m val (dec count)) m)))

(defn diffv [coll1 coll2]
  (->> coll2
       (reduce update-freqs (frequencies coll1))
       (filter #(pos? (val %)))
       (mapv first)))

(defn -main
  [& args])