/* A string is a palindrome if it is identical forward and backward. For example “anna”,
* “civic”, “level” and “hannah” are all examples of palindromic words. Write a program
* that reads a string from the user and uses a loop to determines whether or not it is
* a palindrome. Display the result, including a meaningful output message. */

fun main(args: Array<String>) {
    println("Enter a word")
    val word = readLine()
    val wordReverse = word!!.reversed()
    println("You entered \"$word\"")
    if (word == wordReverse) {
        println("$word is a palindrome")
    }
    else println("$word is not a palindrome")
}