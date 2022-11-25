import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val token = StringTokenizer(br.readLine())
    val N: Int = token.nextToken().toInt()
    val X: Int = token.nextToken().toInt()
    val A = StringTokenizer(br.readLine())

    // 알고리즘
    val answer = mutableListOf<Int>()
    for(i in 0..N-1) {
        val num: Int = A.nextToken().toInt()
        if(num < X) {
            answer.add(num)
        }
    }

    // 출력
    bw.write("${answer.joinToString(" ")}\n")

    bw.flush()
    bw.close()
    br.close()
}