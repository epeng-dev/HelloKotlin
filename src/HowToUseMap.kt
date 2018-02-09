fun main(args: Array<String>) {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    println(map["a"])

    for (pair in map){
        println(pair.key)
        println(pair.value)
    }

    map.forEach { t, u -> println("$t $u") }
}