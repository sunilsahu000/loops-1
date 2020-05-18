import kotlin.math.roundToInt

/* A particular cell phone plan includes 50 minutes of air time and 50 text messages
* for $15.00 a month. Each additional minute of air time costs $0.25, while additional
* text messages cost $0.15 each. All cell phone bills include an additional charge of
* $0.44 to support 911 call centers, and the entire bill (including the 911 charge) is
* subject to 5 percent sales tax. Write a program that reads the number of minutes and
* text messages used in a month from the user. Display the base charge, additional minutes
* charge (if any), additional text message charge (if any), the 911 fee, tax and total bill amount.
* Only display the additional minute and text message charges if the user incurred costs in these
* categories. Ensure that all of the charges are displayed using 2 decimal places.*/

    fun main(args: Array<String>) {
    val cellPhonePlan = 15
    var extraMessage = 0.15
    var extraMinute = 0.25
    val emergency = 0.44
    var tax = (cellPhonePlan + emergency) * 5 / 100
    var totalBill = cellPhonePlan + emergency + tax
    println("Enter extra Text message, enter 0 if none ")
        val extraText = readLine()!!.toInt()
    println("Enter extra minute, enter 0 if none")
        val extraCall = readLine()!!.toInt()

        if (extraCall == 0 && extraText == 0) {
            println("CellPhonePlan for the month: \$$cellPhonePlan")
            println("911 charges: \$$emergency")
            println("Tax charges of 5% : \$$tax")
            println("Total bills: \$$totalBill")
        }
            else if (extraCall == 0 && extraText >= 1) {
                extraMessage *= extraText
                tax = (cellPhonePlan + extraMessage + emergency) * 5 / 100
                totalBill = cellPhonePlan + emergency + extraMessage + tax
            println("CellPhonePlan for the month: \$$cellPhonePlan")
            println("Extra Message charges 0f $extraText message(s): \$${(extraMessage * 100).roundToInt() / 100.0}")
            println("911 charges: \$$emergency")
            println("Tax charges of 5% : \$${(tax * 100).roundToInt() / 100.0}")
            println("Total bills: \$${(totalBill * 100).roundToInt() / 100.0}")
        }
             else if (extraCall >= 1 && extraText == 0) {
                   extraMinute *= extraCall
                   tax = (cellPhonePlan + extraMinute + emergency) * 5 / 100
                   totalBill = cellPhonePlan + emergency + extraMinute + tax
             println("CellPhonePlan for the month: \$$cellPhonePlan")
             println("Extra Minute charges of $extraCall minute(s): \$${(extraMinute * 100).roundToInt() / 100.0}")
             println("911 charges: \$$emergency")
             println("Tax charges of 5% : \$${(tax * 100).roundToInt() / 100.0}")
             println("Total bills: \$${(totalBill * 100).roundToInt() / 100.0}")
                }
            else if (extraCall >= 1 && extraText >= 1) {
                extraMessage *= extraText
                extraMinute *= extraCall
                tax = (cellPhonePlan + extraMessage + extraMinute + emergency) * 5 / 100
                totalBill = cellPhonePlan + emergency + extraMessage + extraMinute + tax
            println("CellPhonePlan for the month: \$$cellPhonePlan")
            println("Extra Message charges 0f $extraText message(s): \$${(extraMessage * 100).roundToInt() / 100.0}")
            println("Extra Minute charges of $extraCall minute(s): \$${(extraMinute * 100).roundToInt() / 100.0}")
            println("911 charges: \$$emergency")
            println("5% tax charges of all bills : \$${(tax * 100).roundToInt() / 100.0}")
            println("Total bills: \$${(totalBill * 100).roundToInt() / 100.0}")
        }
    }