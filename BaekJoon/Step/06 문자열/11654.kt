fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input = br.readLine().toCharArray()

    // 알고리즘
    val answer: Int = input[0].code
    bw.write("${answer}\n")

    bw.flush()
    bw.close()
    br.close()
}