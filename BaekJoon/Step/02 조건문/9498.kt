fun main() {
    // 입력
    val score: Int = readLine()!!.toInt()

    // 알고리즘
    val answer: String = when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

    // 출력
    println(answer)
}