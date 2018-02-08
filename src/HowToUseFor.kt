fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4)

    for (item in arr) {
        println(item)
    }

    arr.forEach { println(it) }

    println(arr.indices)
    for (i in arr.indices) {
        println(arr[i])
    }

    //for(int i = 1; i <= 10; i++)
    println("1 to 10")
    for (i in 1..10) {
        println(i)
    }

    //for(int i = 1; i < 100; i++)
    println("1 until 100")
    for (i in 1 until 100) {
        println(i)
    }

    //for(int x = 2; x <= 10; x+=2)
    println("2..10 step 2")
    for (x in 2..10 step 2) {
        println(x)
    }

    //for(int x = 10; x >= 1; x--)
    println("x in 10 downTo 1")
    for (x in 10 downTo 1) {
        println(x)
    }
}