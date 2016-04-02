(ns easter-day-test
  (:require [clojure.test :refer :all]
            [easter-day :refer :all]))

(defn test-easter-sunday [year month day]
  (testing (str "Easter Sunday " year " should be " day "." month)
    (let [date (easter-sunday year)]
      (is (= month (:month date)))
      (is (= day (:day date))))))

(deftest easter-sunday-by-year
  (test-easter-sunday 2016 3 27)
  (test-easter-sunday 2017 4 16)
  (test-easter-sunday 1976 4 18)
  (test-easter-sunday 1901 4 7)
  (test-easter-sunday 1900 4 15)
  (test-easter-sunday 1899 4 2)
  (test-easter-sunday 2100 3 28)
)
