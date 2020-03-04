#!/usr/bin/env amm


def sorted[A] (array: Array[A], ordered: (A,A) => Boolean): Boolean = {
  def go(index: Int): Boolean = 
    index == array.length - 1 ||
    ordered(array(index), array(index + 1)) &&
    go(index + 1)
 
  go(0)
}

val intComparer = (a:Int, b:Int) => a < b
println(
  sorted(
    Array(234, 213, 2, 435), 
    intComparer
  )
)
println(
  sorted(
    Array(1, 3, 5, 7, 9, 20),
    intComparer
  )
)

val backwardsCharArray = Array('d', 'c', 'b', 'a')
val zToAComparer = (a:Char, b:Char) => a > b
println(
  sorted(
    backwardsCharArray,
    zToAComparer
  )
)
