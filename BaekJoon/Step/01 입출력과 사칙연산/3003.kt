fun main() {
    // 입력
    val input: List<String> = readLine()!!.split(" ")

    // 알고리즘
    val pieces: Array<Int> = arrayOf<Int>(1, 1, 2, 2, 2, 8)
    for(index in pieces.indices) {
        pieces[index] = pieces[index] - input[index].toInt()
    }
    val answer = pieces.joinToString(" ")

    // 출력
    println(answer)
}