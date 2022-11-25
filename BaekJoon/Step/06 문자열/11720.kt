fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: Int = br.readLine().toInt()
    val numbers: List<String> = br.readLine().trim().split("")

    // 알고리즘
    var answer: Int = 0
    repeat(N) {
        val number: Int = numbers[it + 1].toInt()
        answer += number
    }

    // 출력
    bw.write("${answer}\n")

    bw.flush()
    bw.close()
    br.close()
}