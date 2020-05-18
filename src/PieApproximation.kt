import kotlin.math.roundToInt

/* The value of π can be approximated by the following infinite series:

 π ≈ 3+ 4/(2 × 3 × 4) − 4/(4 × 5 × 6) + 4/(6 × 7 × 8) − 4/(8 × 9 × 10) + 4/(10 × 11 × 12) −· · ·

* Write a program that displays 15 approximations of π. The first approximation should make use of
* only the first term from the infinite series.Each additional approximation displayed by your
* program should include one more term in the series,making it a better approximation of π
* than any of the approximations displayed previously. */

fun main(args: Array<String>) {
    var int1 = 2
    var int2 = 3
    var int3 = 4
    var num = 1
    var πApproximate = 3.00
    println("The 15th term approximation of π is:")
    println("0. π = $πApproximate")
    while (num < 15) {
        val estimate: Double = (4/(int1 * int2 * int3).toDouble() * 100000).roundToInt() /100000.0
        if (num % 2 == 1){
            πApproximate += estimate
        } else
            πApproximate -= estimate
        println("$num. π = $πApproximate ")
        int1+=2
        int2+=2
        int3+=2
        num++
    }
}