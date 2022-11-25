fun main() {
    // 입력
    val input: List<String> = readLine()!!.split(" ")

    // 알고리즘
    val A = input[0].toInt()
    val B = input[1].toInt()
    val answer: String = when {
        A > B -> ">"
        A < B -> "<"
        else -> "=="
    }

    // 출력
    println(answer)
}