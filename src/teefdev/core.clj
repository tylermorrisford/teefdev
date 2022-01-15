(ns teefdev.core (:require [org.httpkit.server :as server]
                               [compojure.core :refer [defroutes GET]]
                               [compojure.route :as route]
                               [ring.util.response :as resp])
    (:gen-class))

(defroutes app-routes
  "route requests and handle any not-found"
  (GET "/" [] (resp/content-type (resp/resource-response "index.html" {:root "public"}) "text/html"))
  (GET "/about" [] (resp/content-type (resp/resource-response "about.html" {:root "public"}) "text/html"))
  (route/not-found "Error, page not found!"))

(defn -main
  "This is the main entry point"
  []
  (let [port (Integer/parseInt (or (System/getenv "PORT") "5000"))]
    ; Run the server
    (server/run-server #'app-routes {:port port})
    (println (str "Running t.d webserver at http:/127.0.0.1:" port "/"))))
