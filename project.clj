(defproject htmlparsers-clojure "0.1.0-SNAPSHOT"
  :description "Trying Enlive and Hickory html parsers"
  :url "https://pqr7.wordpress.com/2016/03/11/parse-html-clojure/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [enlive "1.1.6"]
                 [hickory "0.6.0"]]
  :main ^:skip-aot htmlparsers-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
