import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        val num: Int = token.nextToken().toInt()  // 학생수
        val scores: Array<Int> = Array<Int>(num) { 0 }  // 학생들 점수
        var sum: Double = 0.0  // 점수 합계
        repeat(num) {
            val score = token.nextToken().toInt()

            scores[it] = score
            sum += score
        }
        val avg: Double = sum / num  // 평균 점수

        var cnt: Double = 0.0  // 평균 넘는 학생 수
        scores.forEach { score ->
            if(score > avg) cnt++
        }

        bw.write("${String.format("%.3f", cnt / num * 100)}%\n")  // 평균 넘는 학생들의 비율
    }

    bw.flush()
    bw.close()
    br.close()
}