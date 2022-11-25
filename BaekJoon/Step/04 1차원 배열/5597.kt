fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 알고리즘
    val students = Array<Boolean>(30) { false }
    repeat(28) {
        val index: Int = br.readLine().toInt()
        students[index - 1] = true
    }

    val answer: MutableList<Int> = mutableListOf<Int>()
    students.forEachIndexed { index, student ->
        if(!student) { answer.add(index + 1) }
    }
    answer.sort()

    // 출력
    bw.write("${answer.first()}\n${answer.last()}\n")

    bw.flush()
    bw.close()
    br.close()
}