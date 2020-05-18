import kotlin.math.roundToInt

/* In this exercise you will create a program that computes the average of a collection
* of values entered by the user. The user will enter 0 as a sentinel value to indicate
* that no further values will be provided. Your program should display an appropriate
* error message if the first value entered by the user is 0.
* Hint: Because the 0 marks the end of the input it should not be included in the average.*/

fun main(args: Array<String>) {
      println("Enter scores, use 0 to end input")
      val arr = arrayListOf<Int>()
      var score = readLine()!!.toInt()
      do {
          if (score > 0) {
              arr.add(score)
          } else  println("0 ends input it is not a number, enter scores")
          score = readLine()!!.toInt()
          arr.add(score)
          arr.remove(0)
      } while (score <= 0) // first loop validate user first input

      while (arr.size > 0) {
          score = readLine()!!.toInt()
          arr.add(score)
          if (score == 0) {
              arr.remove(0)
              break       // second loop saves user inputs in array until 0 is entered
          }
      }
    println("scores: $arr")
    val average: Double = arr.sum().toDouble()/arr.size
    println( "Sum = ${arr.sum()}")
    println("Average score = $average")

      // 2nd Method to get average
    val mean: Double = arr.average()
    println("Average score = $mean")

    /* Second Method, In case we do not want to store the value in an array */
    var sum = 0
    var  count = 0
    println("Enter score, use 0 to end input")
    var input = readLine()!!.toInt()
    if (input == 0) {
     do {
         println("0 is not a number, use 0 to end input")
         input = readLine()!!.toInt()
         if (input != 0)
             break
     } while (count == 0)
    }
    do {
     sum += input
     count++
    input = readLine()!!.toInt()
    } while(input != 0)

    println("Sum = $sum")
    var half: Double = sum.toDouble() / count
    println("Average = ${(half * 100).roundToInt()/100.0}")

}
