
fun main (args: Array<String>) {
    val number: Array<Int> = arrayOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
    // A program to print addition or multiples of 4
    for (item in number) {
        if (item % 4 == 0)
            println(item)
    }
    // A program to print even numbers
    for (i in number) {
        if (i % 2 == 0)
            println("Even integers: $i")
    }

    // A program to square the value of an array
    val arraySquare: Array<Int> = Array(16) { x -> x * x}
    println(arraySquare[15])

    // From arrayOf(2,10,3,5,20,100,7,9,80) print out all the numbers that are multiples of 10
    val multiples = arrayOf(2,10,3,5,20,100,7,9,80)
    multiples.sort()
    for (value in multiples) {
        if (value % 5 == 0)
            println(value)
    }
}