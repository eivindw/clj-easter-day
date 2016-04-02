(ns easter-day)

(defn easter-sunday
  "Compute Easter Sunday given year - using Spencer Jones formula."
  [year]
  (let [a (mod year 19)
        b (quot year 100)
        c (mod year 100)
        d (quot b 4)
        e (mod b 4)
        f (quot (+ b 8) 25)
        g (quot (+ (- b f) 1) 3)
        h (mod (+ (* 19 a) (- (- b d) g) 15) 30)
        i (quot c 4)
        k (mod c 4)
        l (mod (- (- (+ 32 (* 2 e) (* 2 i)) h) k) 7)
        m (quot (+ a (* 11 h) (* 22 l)) 451)
        n (quot (+ h (- l (* 7 m)) 114) 31)
        p (mod (+ h (- l (* 7 m)) 114) 31)]
    {:month n :day (+ p 1)}))
