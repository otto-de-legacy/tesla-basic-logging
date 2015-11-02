(defproject de.otto/tesla-basic-logging "0.1.4"
  :description "dependencies for logging to kafka using logback"
  :url "https://github.com/otto-de/tesla-kafka-logging"
   :license {:name "Apache License 2.0"
                      :url  "http://www.apache.org/license/LICENSE-2.0.html"}
   :scm {:name "git"
                      :url  "https://github.com/otto-de/tesla-basic-logging"}


  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.slf4j/slf4j-api "1.7.12"]
                 [ch.qos.logback/logback-core "1.1.3"]
                 [ch.qos.logback/logback-classic "1.1.3"]
                 [net.logstash.logback/logstash-logback-encoder "4.4"]

                 [com.github.danielwegener/logback-kafka-appender "0.0.2"]]

  :aot [de.otto.util.escapingmessageconverter]
)
