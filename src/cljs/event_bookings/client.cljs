(ns hello-clojurescript)

(defn handle-click []
  (js/alert "Hello!"))

(def clickable (.getElementById js/document "clickable"))
(.addEventListener clickable "click" handle-click)

(def show-seating (.getElementById js/document "allowbookings"))
(.addEventListener show-seating "click" handle-click)