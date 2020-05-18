/* In this exercise you will create a program that displays a multiplication table that
* shows the products of all combinations of integers from 1 times 1 up to and including
* 10 times 10. Your multiplication table should include a row of labels across the top of
* it containing the numbers 1 through 10. It should also include labels down the left side
*  consisting of the numbers 1 through 10. The expected output from the program is shown below:
                 1   2   3   4   5   6   7   8   9   10
             1   1   2   3   4   5   6   7   8   9   10
             2   2   4   6   8   10  12  14  16  18  20
             3   3   6   3   12  15  18  21  24  27  30
             4   4   8   12  16  20  24  28  32  36  40
             5   5   10  15  20  25  30  35  40  45  50
             6   6   12  18  24  30  36  42  48  54  60
             7   7   14  21  28  35  42  49  56  63  70
             8   8   16  24  32  40  48  56  64  72  80
             9   9   18  27  36  45  54  63  72  81  90
             10  10  20  30  40  50  60  70  80  90  100   */

fun main(args: Array<String>) {
    for (a in 1..10){
        print("\t$a")
    }
    for (i in 1..10) {
        val times2 = i * 2
        val times3 = i * 3
        val times4 = i * 4
        val times5 = i * 5
        val times6 = i * 6
        val times7 = i * 7
        val times8 = i * 8
        val times9 = i * 9
        val times10 = i * 10
        print("\n$i\t$i\t$times2\t$times3\t$times4\t$times5" +
                "\t$times6\t$times7\t$times8\t$times9\t$times10")
    }
}