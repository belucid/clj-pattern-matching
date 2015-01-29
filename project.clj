(defproject clj-pattern-matching "0.1.0-SNAPSHOT"
  :description "Clojure Pattern Matching: Best Practices"
  :url "http://github.com/belucid/clj-pattern-matching"
  
  :license {:name "Public Domain"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :support {
    :name "Sean Johnson"
    :email "sean@path.com"
  }

  :dependencies [
    [org.clojure/clojure "1.6.0"] ; Lisp on the JVM http://clojure.org/documentation
    [org.clojure/core.match "0.3.0-alpha4"] ; Erlang-esque pattern matching https://github.com/clojure/core.match
    [defun "0.2.0-RC"] ; Erlang-esque pattern matching for Clojure functions https://github.com/killme2008/defun
  ])