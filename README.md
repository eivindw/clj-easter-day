[![Clojars Project](https://img.shields.io/clojars/v/easter-day.svg)](https://clojars.org/easter-day)

# clj-easter-day

A Clojure library designed to calculate Easter Sunday for a given year.

Using Harold Spencer Jones formula as given here:
(https://no.wikipedia.org/wiki/P%C3%A5skeformelen)

## Usage

The function `easter-sunday` will, given a 4 digit year, return a map containing the
day and month of Easter Sunday for that given year:
```clojure
(require '[easter-day :refer [easter-sunday]])
(:day (easter-sunday 2016))
(:month (easter-sunday 2016))
```

## License

Copyright © 2016 Eivind Waaler

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
