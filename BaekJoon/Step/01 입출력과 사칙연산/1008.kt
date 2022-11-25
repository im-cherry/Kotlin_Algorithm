fun main() {
    // 입력
    val input = readLine()!!.split(" ")

    // 알고리즘
    val A: Double = input[0].toDouble()
    val B: Double = input[1].toDouble()
    val answer: Double = A / B

    // 출력
    println(answer)
}