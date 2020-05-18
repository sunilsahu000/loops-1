/* Write a function that takes in a String array as parameter and returns
* a string containing all the words in the array separated by
* Eg: If I pass an array that contains these words: *one* *two* *three* *four* to the function
* it will return it will return *one,two,three */

fun main (args: Array<String>){
    val numString  = arrayOf("One", ", ", "Two", ", ", "Three", ", ", "Four", ", ", "Five")
    for (item in numString){
        print(item)
        if (item == "Three"){
            break   //break keyword is use to break out of any loop
        }
    }
}