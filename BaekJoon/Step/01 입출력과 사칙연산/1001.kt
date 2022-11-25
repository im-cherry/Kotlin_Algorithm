fun main() {
    // 입력
    val input = readLine()!!.split(" ")

    // 알고리즘
    val A: Int = input[0].toInt()
    val B: Int = input[1].toInt()
    val answer: Int = A - B

    // 출력
    println(answer)
}