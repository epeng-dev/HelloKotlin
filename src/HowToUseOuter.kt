fun main(args: Array<String>) {
    outer@ for (i in 1..100) {
        for (j in 1..100) {
            print(j)

            if (j == 10){
                println("")
                break@outer
            }
        }
    }
}