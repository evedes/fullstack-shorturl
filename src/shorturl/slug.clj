(ns shorturl.slug)

(def charset "ABCDEFGHIJKLMNOPQRSTUVWXYZ")

charset
(comment
  (rand-nth charset)
  (apply str (take 4 (repeatedly #(rand-nth charset))))
  
  #_)

(defn generate-slug []
  (->> (repeatedly #(rand-nth charset))
       (take 4)
       (apply str)))


(comment
  (generate-slug)
  
  
  
  #_)