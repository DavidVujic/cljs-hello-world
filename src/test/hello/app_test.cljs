(ns hello.app-test
  (:require [cljs.test :refer [deftest testing is]]))

(defn hello-world []
  "Hello World.")

(deftest hello-world-test []
  (testing "returns greeting"
    (is (= "Hello World." (hello-world)))))
