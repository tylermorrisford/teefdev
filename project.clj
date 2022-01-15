(defproject teefdev "0.1.0-SNAPSHOT"
  :description "personal site for @tylermorrisford"
  :url "https://teef.dev"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 ; Compojure - A basic routing library
                 [compojure "1.6.1"]
                  ; Our Http library for client/server
                 [http-kit "2.3.0"]
                  ; Ring defaults - for query params etc
                 [ring/ring-defaults "0.3.2"]]
  :repl-options {:init-ns teefdev.core}
  :main ^:skip-aot teefdev.core)

