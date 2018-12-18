#!/usr/bin/env amm


def sorted[A] (array: Array[A], ordered: (A,A) => Boolean): Boolean = {
  if(array.length <= 1) return true

  def go(index: Int): Boolean = {
    if (index == 0) return go(1)
    if (index == array.length) return true
    if(!ordered(array(index - 1), array(index))) return false

    go(index + 1)
  }
 
  go(0)
}

val intSorter = (a:Int, b:Int) => a < b
println(
  sorted(
    Array(234, 213, 2, 435), 
    intSorter
  )
)
println(
  sorted(
    Array(1, 3, 5, 7, 9, 20),
    intSorter
  )
)

val backwardsCharArray = Array('d', 'c', 'b', 'a')
val zToA_sorter = (a:Char, b:Char) => a > b
println(
  sorted(
    backwardsCharArray,
    zToA_sorter
  )
)
