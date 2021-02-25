### ClojureScript: React with a Hiccup

#### Func Prog Sweden second meetup 2021

Here's [the recording from the session](https://www.youtube.com/watch?v=SVouy-Zd-_g)

And the [Slides](https://docs.google.com/presentation/d/1N91pDGYlXjGx6hXoG0NAlSUz-sWnN15YLKqWXwSWidE/edit?usp=sharing)
used in the 2021-02-24 [FuncProg Sweden Second MeetUp 2021](https://www.meetup.com/Func-Prog-Sweden/events/275884481/)


#### Blog posts
The [12 Stages of Learning Clojure](https://davidvujic.blogspot.com/2020/12/the-12-stages-of-learning-clojure.html) blog post, mentioned in the talk.

Also, have a look at this [Blog post](https://davidvujic.blogspot.com/2021/01/simple-within-parentheses.html)
for an introduction to `Clojure`, `ClojureScript`, `Reagent` and `re-frame`.


##### The example code
Starting the app:

``` bash
npx shadow-cljs watch app tests
```

You can now browse:
* the example web page at http://localhost:8080
* the unit test page at http://localhost:8081

###### Emacs
Or, if you are using Emacs, run the command `cider-jack-in-cljs` from the editor. 
To make the app startup process even smoother, create a `.dir-locals.el` file in the root folder, add this to it:

``` emacs-lisp
((nil . ((cider-default-cljs-repl . shadow)
         (cider-shadow-default-options . ":app")
         (cider-shadow-watched-builds . (":app" ":tests")))))
```

##### The CSS
The theme switching `css` comes from this [blog post](https://alexandersandberg.com/theme-switcher/).
