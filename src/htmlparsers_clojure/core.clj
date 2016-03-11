(ns htmlparsers-clojure.core
  (:require
    [net.cgrand.enlive-html :as enlive-html]
    [hickory.core]
    [hickory.select])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn findlink [html linktext]
  (let [resource (enlive-html/html-resource (java.io.StringReader. html))
        selector [[:a (enlive-html/has [(enlive-html/text-pred #{linktext})])]]]
    (-> resource
        (enlive-html/select selector)
        first
        :attrs
        :href)))

(defn findlink2 [html linktext]
  (let [resource (hickory.core/as-hickory (hickory.core/parse html))
        selector (hickory.select/tag :a)
        predicate #(= [linktext] (:content %))]
    (->
      (filter predicate (hickory.select/select selector resource))
      first
      :attrs
      :href)))
