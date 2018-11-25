# figwheel-main/fulcro/devcards trial

Seeing an warning when using `devcards` with `figwheel-main` and `fulcro`

To reproduce:

    clj -A:dev

```
$ clj -A:dev
[Figwheel] Compiling build dev to "target/public/cljs-out/dev-main.js"
[Figwheel] Compile Warning   cards/com/grzm/ex/fmfd/cards.cljs   line:29  column:1

  var: devcards.core/dom-node* is not public

  24                       (dom/div :.content
  25                                (dom/div message)
  26                                (dom/div "Some content here would be nice"))))))
  27  
  28  
  29  (defcard-fulcro root
      ^---
  30    Root
  31    {}
  32    {:inspect-data false})

```
