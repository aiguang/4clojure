27
 ((fn [coll] (if(or (= 1 (count coll)) (= 0 (count coll)))
true
             (if(= (nth coll 0) (nth coll (-  (count coll) 1)))
(recur (take (- (count (drop 1 coll)) 1) (drop 1 coll)))
               false)
)) "racecar")