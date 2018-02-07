fun main(args: Array<String>) {
    val sum1 = sum(1, 2)
    val sum2 = sum2(2, 3)
    val sum3 = sum3(3, 4)

    val max = max(sum1, sum2)
    val max2 = max2(sum2, sum3)

    println(sum1.toString() + " " + sum2 + " " + sum3)
    println("max: " + max + ", max2: " + max2)
}

fun sum(a: Int, b: Int): Int = a + b

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun sum3(a: Int, b: Int) = a + b

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun max2(a: Int, b: Int) = if (a > b) a else b


