fun main() {
    val T: Int = readLine()!!.toInt()
    for(t in 1..T) {
        val input: List<String> = readLine()!!.split(" ")
        val A: Int = input[0].toInt()
        val B: Int = input[1].toInt()

        println(A + B)
    }
}