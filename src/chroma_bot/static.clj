(ns chroma-bot.static
  "Layouts for server-side rendered pages"
  (:require [hiccup.core :refer [html]]
            [hiccup.page :refer [include-css]]))

(defn page
  "Renders html page with provided content"
  [content]
  (html
    [:html
     [:head
      [:meta {:charset "utf-8"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
      [:title "Chroma Bot"]

      (include-css "//oss.maxcdn.com/semantic-ui/2.1.7/semantic.min.css")
      (include-css "/style.css")]

     [:body content]]))

(def home
  (page
    [:div.ui.container
     [:div.ui.vertical.masthead.center.aligned.segment
      [:div.ui.test.container
       [:div.logo
        [:div.banner-pane.n-0]
        [:div.banner-pane.n-1]
        [:div.banner-pane.n-2]
        [:div.banner-pane.n-3]
        [:div.banner-pane.n-4]]

       [:h1.header "Welcome to Chroma Bot"]
       [:h3 "Telegram bot that helps you with colors"]
       [:a.ui.huge.button {:href "#"} "Start Conversation" [:i.icon.right.arrow]]]]]))



