fun main(args: Array<String>) {
    val numbers = -100..100
    val positives = numbers.filter { x -> x > 0 }
    val positives2 = numbers.filter { it > 0 }

    for (num in positives){
        println(num)
    }

    for (num in positives2){
        println(num)
    }
}