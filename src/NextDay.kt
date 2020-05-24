import java.time.LocalDate

/* Write a program that reads a date from the user and computes its immediate successor.
* For example, if the user enters values that represent 2013-11-18 then your program
* should display a message indicating that the day immediately after 2013-11-18 is
* 2013-11-19. If the user enters values that represent 2013-11-30 then the program
* should indicate that the next day is 2013-12-01. If the user enters values that represent
* 2013-12-31 then the program should indicate that the next day is 2014-01-01.
* The date will be entered in numeric form with three separate input statements;
* one for the year, one for the month, and one for the day. Ensure that your program works */

fun main(args: Array<String>) {
    println("Enter day")
    var day = readLine()!!.toInt()
    println("Enter month")
    var month = readLine()!!.toInt()
    //The loop ensure user input is accurate
    while ((day <= 31 || day > 31) && (month <= 12 || month > 12)) {
        if (month == 2 && day > 29) {
            println("Incorrect day or month")
            println("Enter day")
            day = readLine()!!.toInt()
            println("Enter month")
            month = readLine()!!.toInt()
        } else
            if ((month == 4 || month == 6 ||
                            month == 9 || month == 11) && day > 30) {
                println("Incorrect day or month")
                println("Enter day")
                day = readLine()!!.toInt()
                println("Enter month")
                month = readLine()!!.toInt()
            } else
                if ((month == 1 || month == 3
                                || month == 5 ||month == 7 || month == 8
                                || month == 10 || month == 12) && day > 31) {
                    println("Incorrect day or month")
                    println("Enter day")
                    day = readLine()!!.toInt()
                    println("Enter month")
                    month = readLine()!!.toInt()
                }
        else if (month > 12 || day > 31) {
                    println("Invalid date")
                    println("Enter day")
                    day = readLine()!!.toInt()
                    println("Enter month")
                    month = readLine()!!.toInt()
                }
        else break
    }
    println("Enter year")
    var year = readLine()!!.toInt()
    val today = LocalDate.of(year, month, day)
    println("Today's date is $today")

    when (month) {
        2 -> for (days in 1..29){
            if (day == 28 || day == 29){
                day = 1
                month += 1
                break
            }
            if (day == days){
                day+=1
                if (day > days) {
                    break
                }
            }
        }
        4,6,9,11 -> for (days in 1..30){
            if (day == 30){
                day = 1
                month += 1
                break
            }
            if (day == days){
                day+=1
                if (day > days) {
                    break
                }
            }
        }
        1,3,5,7,8,10,12 -> for (days in 1..31){
            if (day == 31){
                day = 1
                if (month == 12){
                    month = 1
                    year +=1
                } else month += 1
                break
            }
            if (day == days){
                day +=1
                if (day > days) {
                    break
                }
            }
        }
    }
    val nextDay = LocalDate.of(year,month,day)
    println("Next day date is $nextDay")
    if (day == 1 && month == 1) {
        println("Hello World, Happy New Year in Advance")
    }
    if (day == 1 && month == 10) {
        println("Hello Nigerians, Happy independence day in Advance")
    }
}

