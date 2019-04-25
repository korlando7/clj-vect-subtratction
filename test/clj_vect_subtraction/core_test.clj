(ns clj-vect-subtraction.core-test
  (:require [clojure.test :refer :all]
            [clj-vect-subtraction.core :refer :all]))

(def test-vec1 [1 1 2 3 4 5])

(deftest test-update-freq-dec
  (testing "Update freq map when val is found"
    (is (=
         (update-freqs (frequencies test-vec1) 3)
         {1 2 2 1 3 0 4 1 5 1}))))

(deftest test-update-freq-nil
  (testing "Update freq map when val isn't found"
    (is (=
         (update-freqs (frequencies test-vec1) 6)
         {1 2 2 1 3 1 4 1 5 1}))))

(deftest test-diff-v
  (testing "test find difference of two vectors"
    (prn (diffv [1 2 3 4 5] [2 6 4 3 2]))))
