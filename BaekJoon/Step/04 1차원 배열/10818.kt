import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: Int = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())

    // 알고리즘
    var min: Int = 1000000
    var max: Int = -1000000
    while(token.hasMoreTokens()) {
        val num: Int = token.nextToken().toInt()
        min = if(num < min) num else min
        max = if(num > max) num else max
    }

    // 출력
    bw.write("${min} ${max}\n")

    bw.flush()
    bw.close()
    br.close()
}