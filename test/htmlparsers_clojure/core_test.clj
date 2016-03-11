(ns htmlparsers-clojure.core-test
  (:require [clojure.test :refer :all]
            [htmlparsers-clojure.core :refer :all]))

(def html (slurp "test.html"))
(def linktext "MSKU0581488")
(def expectedhref "http://classic.maerskline.com:80/appmanager/maerskline/public;JSESSIONID_ADMINTOOLS=4wRqWh1M7WbY9LSNpMQLMXjgJ0T2N2nnm8q9ptwTQYlp2317L1st!-215806288!1450934878?_nfpb=true&_windowLabel=portlet_trackSimple_1&portlet_trackSimple_1_actionOverride=%2Fportlets%2Ftracking3%2Ftrack%2FTrackingOverview%2FgetContainerInfo&portlet_trackSimple_1uid=0&portlet_trackSimple_1shipmentNo=L3HBNH3O8XO3B&portlet_trackSimple_1containerNo=MSKU0581488&_pageLabel=page_tracking3_trackSimple")

(deftest findlink-test
  (testing "Testing Enlive html parser"
    (is (= expectedhref (findlink html linktext)))))

(deftest findlink2-test
  (testing "Testing Hickory html parser"
    (is (= expectedhref (findlink2 html linktext)))))
