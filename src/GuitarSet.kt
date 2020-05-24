/* For a list of integers *S* and a target number *G*, a subset of *S*
that adds up to *G* is called a guitar subset.
For example:
                Input: 24
                [12, 1, 61, 5, 9, 2]
                Output: [12, 9, 2, 1]
(G=24, S=[12, 1, 61, 5, 9, 2], there is a guitar subset [12, 9, 2, 1] that adds up to 24).
Integers can appear more than once in the list. You may assume all numbers in the list are positive.
Write a program to check if the user input has a guitar subset for the specified number G or not
(both the list of integers and the number G are input parameters).*/

fun main(args: Array<String>) {
    var arr = arrayListOf<Int>()
    var a = readLine()!!.toInt()
    do { val input = readLine()!!.toInt()
        arr.add(input)
    } while (arr.size <= (a -1))
    println(arr)
   var b: List<Int>
    //var b = arr.slice(0 until a)
   do {
        a--
        arr.shuffle()
            b = arr.slice(0..a)
            if (b.sum() == 24) {
                println(b)
            }
       else if (a <= 0) {
                a+=1
                println("no set")
                break
            }
    } while (b.sum() != 24 )

   /* do {
        arr.shuffle()
        b = arr.slice(0..1)
        if (b.sum() == 24) {
            println(b)
        } else
        b = arr.slice(0..2)
        if (b.sum() == 24) {
            println(b)
        } else
            b = arr.slice(0..3)
        if (b.sum() == 24) {
            println(b)
        } else
            b = arr.slice(0 until a)
        if (b.sum() == 24) {
            println(b)
        }
            //println("no subset")
        //break
    } while (b.sum() != 24) */


    /*var b = arr.slice(0 until a)
        arr.shuffle()
        if (b.sum() != 24) {
            a--
            b = arr.slice(0 until a)
            println(b)
        } else
            println(b)


             var b = arr.slice(0 until a)
    while (b.sum() != 24) {
        arr.shuffle()
        b = arr.slice(0 until a)
        if (b.sum() == 24) {
            println(b)
        }
        a--
    }*/
}