fun main() {
    // 입력
    val x: Int = readLine()!!.toInt()
    val y: Int = readLine()!!.toInt()

    // 알고리즘
    val answer = when {
        (x > 0 && y > 0) -> 1
        (x < 0 && y > 0) -> 2
        (x < 0 && y < 0) -> 3
        else -> 4
    }

    // 출력
    println(answer)
}