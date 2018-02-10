fun main(args: Array<String>) {
    var arrayList: ArrayList<String> = ArrayList()
    var array = listOf("1", "2", "3", "4")

    arrayList.add("1")
    arrayList.add("2")
    arrayList.add("3")
    arrayList.add("4")

    array.forEach { print(it) }
    println("")
    arrayList.forEach { print(it) }
}