fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input: List<String> = br.readLine().split(" ")

    // 알고리즘
    val A: Int = input[0].reversed().toInt()
    val B: Int = input[1].reversed().toInt()
    val answer: Int = if (A > B) A else B

    // 출력
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}