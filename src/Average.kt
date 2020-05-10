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
        println("Enter a valid number, 0 ends input")
        x = readLine()!!.toInt()
        if (x > 0) {
            arr.add(x)
        }
    }while (x <= 0)

    while (arr.size < 100) {
        x = readLine()!!.toInt()
        arr.add(x)
        if (x == 0) {
            arr.remove(0)
            println("scores: $arr")
            break
        }
    }
    var average: Double = arr.sum().toDouble()/arr.size
    println("Average score = $average")

    // 2nd Method to get average
    var mean: Double = arr.average()
    println("Average score = $mean")
}