fun main(args: Array<String>) {
    val p: String by lazy {
        var i = 123
        for(num in 1..10)
            i += num
        println("end Calculate")
        "abc" + i
    }

    println(p)
}