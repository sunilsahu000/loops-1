import kotlin.math.roundToInt

/*A particular retailer is having a 60 percent off sale on a variety of discontinued products.
*The retailer would like to help its customers determine the reduced price of the merchandise
* by having a printed discount table on the shelf that shows the original prices and the prices
* after the discount has been applied. Write a program that uses a loop to generate this table,
* showing the original price, the discount amount, and the new price for purchases of
* $4.95, $9.95, $14.95, $19.95 and $24.95. Ensure that the discount amounts and the new
* prices are rounded to 2 decimal places when they are displayed.*/

fun main(args: Array<String>) {
    var prices = arrayOf(4.95, 9.95, 14.95, 19.95, 24.95)

    println("original price  discount amount  new price")
    for (price in prices){
        val discountPrice = price * 60 / 100
        val newPrice = (price - discountPrice)
        val newPrices = (newPrice * 100).roundToInt() / 100.0
        println("\$$price               \$$discountPrice           \$$newPrices")
    }
}