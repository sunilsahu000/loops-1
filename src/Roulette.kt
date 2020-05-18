/* A roulette wheel has 38 spaces on it. Of these spaces, 18 are black, 18 are red,
* and two are green. The green spaces are numbered 0 and 00. The red spaces are numbered
* 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30 32, 34 and 36. The remaining integers
* between 1 and 36 are used to number the black spaces. Many different bets can be placed in roulette.
* We will only consider the following subset of them in this exercise:
* • Single number (1 to 36, 0, or 00) • Red versus Black • 1 to 18 versus 19 to 36
* • Odd versus Even (Note that 0 and 00 do not pay out for even)
* Write a program that simulates a spin of a roulette wheel by using Python’s random number generator.
* Display the number that was selected and all of the bets that must be payed.
* For example, if 13 is selected then your program should display: The spin resulted in 13...
* Pay 13, Pay Black, Pay Odd, Pay 1 to 18
* If the simulation results in 0 or 00 then your program should display Pay 0 or Pay 00 without any further output.*/
fun main(args: Array<String>) {
    val x = "00"
    val y = x.toInt()
    val spaces = arrayOf<Int>(0, y, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36)
    val spin = spaces.random()
    println("The spin resulted in $spin... ")
    for (item in spaces) {
        if (item == spin && (item != 0 || item != y)) { println("Pay $item")
            if (item != 0 || item != y) {
                if (item % 2 == 0 ) { println("Pay even") }
                else println("Pay odd") }
        }
    }
    when (spin) {
        0, y -> println("Pay 0 or Pay 00")
        1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 -> println("Pay Red")
        2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 -> println("Pay Black")
    }
    for (win in 1..36) {
        if (win == spin) {
            if (win in 1..18 ) { println("Pay 1 to 18") }
            else println("Pay 19 to 36") }
    }
}
