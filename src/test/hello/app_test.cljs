(ns hello.app-test
  (:require [cljs.test :refer [deftest testing is]]
            [hello.app :as app]))

(deftest hello-world-test []
  (testing "returns greeting"
    (is (= "Hello World." (app/hello-world)))))
