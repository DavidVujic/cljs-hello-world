(ns hello.app-test
  (:require [cljs.test :refer [deftest testing is]]
            [hello.app :as app]))

(deftest init-test []
  (testing "returns greeting"
    (is (= "Hello World" (app/init)))))
