/* In this exercise you will create a program that computes the average of a collection
* of values entered by the user. The user will enter 0 as a sentinel value to indicate
* that no further values will be provided. Your program should display an appropriate
* error message if the first value entered by the user is 0.
* Hint: Because the 0 marks the end of the input it should not be included in the average.*/

fun main(args: Array<String>) {
    println("Enter scores, use 0 to end input")
    var arr = arrayListOf<Int>()
    var x = readLine()!!.toInt()
    do {
        if (x > 0) {
            arr.add(x)
        } else  println("0 ends input, it is not a number")
        x = readLine()!!.toInt()
        arr.add(x)
        arr.remove(0)
    } while (x <= 0) // first loop validate user first input

    while (arr.size > 0) {
        x = readLine()!!.toInt()
        arr.add(x)
        if (x == 0) {
            arr.remove(0)
            break       // second loop saves user inputs in array until 0 is entered
        }
    }
    println("scores: $arr")
    var mean: Double = arr.average()
    println("Average score = $mean")

    // 2nd Method to get average
    var average: Double = arr.sum().toDouble()/arr.size
    println("Average score = $average")
}