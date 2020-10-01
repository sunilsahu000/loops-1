fun main(args: Array<String>) {
    val arr = arrayListOf<Int>()
    //var ar = arrayListOf<Int>()
    var a =Integer.valueOf(readLine())
    do {
        val input =Integer.valueOf(readLine())
        arr.add(input)
    } while (arr.size <= (a - 1))
    println(arr)
}
