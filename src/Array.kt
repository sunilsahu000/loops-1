// A program to concatenate array

fun main(args: Array<String>) {
    var num = arrayListOf(1,2,3)
    var sum = arrayListOf(1,4,5,6)
    println(num)
    /* Write a function that merges two sorted lists into a new sorted list.
    * e.g. [1,4,6,2],[2,3,5] → [1,2,2,3,4,5,6] */

    // using + operator to concatenate the array
    val numsum = num + sum
    println("New list using + operator:${numsum.sorted()}")

    // Using addAll() to Concatenate the array
    var sumnum: ArrayList<Int> = arrayListOf()
    sumnum.addAll(sum)
    sumnum.addAll(num)
    println("New list using addAll() func:${sumnum.sorted()}")

// Write a function that merges two sorted lists into a new sorted list without repeating same element.

    var numsum2 = num.union(sum)
    println("New list using union() func:$numsum2")


}