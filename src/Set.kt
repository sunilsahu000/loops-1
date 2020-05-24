fun main(args: Array<String>) {
    val arr = arrayListOf<Int>()
    //var ar = arrayListOf<Int>()
    var a = readLine()!!.toInt()
    do {
        val input = readLine()!!.toInt()
        arr.add(input)
    } while (arr.size <= (a - 1))
    println(arr)
}