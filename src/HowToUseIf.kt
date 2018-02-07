fun main(args: Array<String>) {
    val hello= "Hello"
    var hello2: String? = "Hello2"
    //hello = null String은 null type이 될 수 없다.
    hello2 = null // String?은 null을 쓸 수 있다.
    println("hello.length: " + hello.length)

    // null일 수도 있기 때문에 length같은 NullPointerException이 뜰 수 있는 건 쓸 수 없음
    //println("hello2.length: " + hello2.length)
    hello2 = "Hello2"
    val count : Int = if (hello2 != null) (hello2 as String).length else -1
    println("hello2.length: " + count)

    println("hello2.length: " + hello2.length)//smart cast String

    hello2 = null;
    println("hello2.length: " + hello2?.length ?: -1)//안전호출(?.)과 엘비스 오퍼레이터(?:)

    //hello2!.length() 강제 호출

    println("getStringLength: " + getStringLength(hello))
    println("getStringLength2: " + getStringLength2(hello2))
    hello2 = "Hello2"
    println("getStringLength2: " + getStringLength2(hello2))
}

fun getStringLength(something: Any): Int? {
    if (something is String) {
        return (something as String).length;
    }
    return null
}

fun getStringLength2(something: Any?): Int? {
    if (something !is String) {
        return null;
    }
    return something.length
}