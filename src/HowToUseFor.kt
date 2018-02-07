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

    for (i in 1..10) {
        println(i)
    }
}