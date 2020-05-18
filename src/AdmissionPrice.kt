/* A particular zoo determines the price of admission based on the age of the guest.
* Guests 2 years of age and less are admitted without charge. Children between 3 and
* 12 years of age cost $14.00. Seniors aged 65 years and over cost $18.00. Admission
* for all other guests is $23.00. Create a program that begins by reading the ages of
* all of the guests in a group from the user, with one age entered on each line.
* The user will enter a blank line to indicate that there are no more guests in the group.
* Then your program should display the admission cost for the group with an appropriate message.
* The cost should be displayed using two decimal places. */

fun main(args: Array<String>) {
    var price: Double = 0.0
    var totalCharges: Double = 0.0
    var participant = 0
    var participantAge = 0
    println("Enter no of participant(s)")
    val num = readLine()!!.toInt()
    println("Enter age of participant")
    while (participant < num && (participantAge <= 65 || participantAge > 65)) {
        participant ++
        participantAge = readLine()!!.toInt()
        when (participantAge) {
            in 0..2 -> price = 0.0
            in 3..12 -> price = 14.00
            in 13..64 -> price = 23.00
            in 65..participantAge -> price = 18.00
        }
        println("The price for participant aged $participantAge is \$$price")
        totalCharges += price
        if (participant == num)
            println("The total price for all participant(s) = \$$totalCharges")
    }
}