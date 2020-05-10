
/* A parking garage charges 200 naira minimum fee to park for three hours in a day.
* An additional charge of 50 naira per hour on every hour in excess of three hours.
* The maximum charge for 24 hours however is 1000 naira.
* Assuming that no car parked for longer than 24 hours in a day.
* You are required to write an algorithm to calculate the charges for a customer.
* Your algorithm is expected to calculate and print out the customer’s charges for
* the standard three hours charge, his charges for additional hours and the total charges.
* Note that the maximum daily charge is 1000 naira.
* Include in your algorithm the logic to make it impossible to print out daily charges more than 1000 */


fun main(args: Array<String>) {
    var hrs = 3
    val charges = 200
    var fine = 0
    if (hrs <= 3 )
        println("The price for $hrs hrs is: $charges naira")
    while (hrs < 24) {
        fine+= 50
        hrs++
        val overstay = fine + charges
        println("The price for $hrs hrs is: $overstay naira")
        if (hrs == 24 || overstay == 1000)
            break
    }
}