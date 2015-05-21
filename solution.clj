27
 ((fn [coll] (if(or (= 1 (count coll)) (= 0 (count coll)))
true
             (if(= (nth coll 0) (nth coll (-  (count coll) 1)))
(recur (take (- (count (drop 1 coll)) 1) (drop 1 coll)))
               false)
)) "racecar")

29
(fn [val] (reduce str (re-seq #"[A-Z]" val)))

32
(fn [coll] (interleave coll coll)

39
 ((fn [coll coll2] (letfn  [(inter [coll coll2] (let  [c1 (seq coll) c2 (seq coll2)]  (if (and c1 c2) (cons (first c1) (cons (first c2) (inter (rest c1) (rest c2)))) ) ))]) (inter coll coll2)) )
