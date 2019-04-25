# clj-vect-subtraction

[![Clojars Project](https://img.shields.io/clojars/v/clj-vect-subtraction.svg)](https://clojars.org/clj-vect-subtraction)

find the difference in two vectors similar to
[elixir's list subtraction](https://elixirschool.com/en/lessons/basics/collections/#list-subtraction)

## Installation

Using Leiningen/Boot

```clojure
[clj-vect-subtraction "0.1.0-SNAPSHOT"]
```

## Usage

```clojure
(ns yournamespace
  (:require [clj-vect-subtraction.core :refer [diffv]]))
```

## Examples

```clojure
(diffv [1 2 3 4 5] [1 2 3 6]) ; returns [4 5]
```

Copyright © 2019

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
