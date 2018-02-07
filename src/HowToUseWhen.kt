fun main(args: Array<String>) {
    val a = 2
    val b = 22
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    when (max) {
        2 -> println("max == 2")
        3 -> println("max == 3")
        else -> {
            println("max is not 2 or 3")
        }
    }

    when (max) {
        whenSucess(max) -> println("call function success") //return 값으로 분기 가능
        else -> println("fail")
    }

    var numberRange = 10..12
    when (max) {
        in 1..9 -> println("This is single digit.")
        in numberRange -> println("Yes, This is 10 < num < 12!")
        !in 13..20 -> println("This number is not 13 < num < 20, Right?")
        else -> println("This number is 13 < num < 20")
    }

    val string = "prefixHello"
    val hasPrefix = when (string) {
        is String -> string.startsWith("prefix")
        else -> false
    }
    println(hasPrefix)

    when {
        max.isOdd() -> println("max is odd")
        max.isEven() -> println("max is even")
        else -> println("Is this number??")
    }
}

fun whenSucess(arg: Int): Int {
    return arg
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}