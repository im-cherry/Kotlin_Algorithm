import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: Int = br.readLine().toInt()  // 시험 본 과목의 개수
    val token = StringTokenizer(br.readLine())

    // 알고리즘
    var max: Double = 0.0  // 최대값
    val scores = Array<Double>(N) { 0.0 }
    scores.forEachIndexed { index, _ ->
        val score = token.nextToken().toDouble()
        scores[index] = score

        max = if (score > max) score else max
    }

    var sum: Double = 0.0
    scores.forEach { score ->
        sum += (score / max * 100)
    }

    // 출력
    bw.write("${sum/N}\n")

    bw.flush()
    bw.close()
    br.close()
}