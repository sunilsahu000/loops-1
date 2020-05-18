/*There are numerous phrases that are palindromes when spacing is ignored.
*Examples include “go dog”, “flee to me remote elf” and “some men interpret nine memos”,
* among many others. your solution should ignores spacing while determining whether or
* not a string is a palindrome.For an additional challenge, extend your solution so that
* it also ignores punctuation marks and treats uppercase and lowercase letters as equivalent.*/

fun main(args: Array<String>) {
    println("Write a sentence")
    var sentence = readLine().toString().toUpperCase()
    var sentenceReverse = sentence.reversed().toUpperCase()
    println(sentenceReverse)
    println("You entered \"$sentence\"")
    sentenceReverse.toCharArray()
    if (sentence == sentenceReverse) {
        println("$sentence is a palindrome")
    }
    else println("$sentence is not a palindrome")
}