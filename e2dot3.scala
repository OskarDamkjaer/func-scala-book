#!/usr/bin/env amm

// The book said the only thing to compile would be the right answer ;) 
def curry[A, B, C] (f: (A, B) => C): A => (B => C) = 
  (a: A) => (b: B) => f(a, b)
