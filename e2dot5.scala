#!/usr/bin/env amm

// fanns det något som hette andThen?
def compose[A, B, C] (f: B => C, g: A => B): A => C =
  (a: A) => f(g(a))

println(compose((a: Int) => a + 1, (b: Int) => b * 2)(3))

