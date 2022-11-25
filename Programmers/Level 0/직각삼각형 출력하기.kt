fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)

    repeat(n) {
        repeat(it + 1) {
            print("*")
        }
        println()
    }
}