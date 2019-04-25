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

(deftest test-diffv
  (testing "test find difference of two vectors"
    (is (= (diffv [1 2 3 4 5] [2 6 4 3 2]) [1 5]))))


(deftest test-diffv-same
  (testing "test find difference of two exact vectors"
    (is (= (diffv [1 2 3 4 5] [1 2 3 4 5]) []))))


(deftest test-diffv-empty1
  (testing "test finding difference with first vector empty"
    (is (= (diffv [] [6 5 4 3 7]) []))))

(deftest test-diffv-empty2
  (testing "test finding difference with second vector empty"
    (is (= (diffv [1 6 5 4] []) [1 6 5 4]))))


(deftest test-diffv-empty3
  (testing "test finding difference with both vectors empty"
    (is (= (diffv [] []) []))))

(deftest test-diffv-single
  (testing "test finding difference with different single value vectors"
    (is (= (diffv [5] [6]) [5]))))

(deftest test-diffv-single2
  (testing "test finding difference with same single value vectors"
    (is (= (diffv [5] [5]) []))))


