import java.lang.Integer.min

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: Int = br.readLine().toInt()  // N kg

    // 알고리즘
    var answer: Int = Int.MAX_VALUE
    for(three in 0 .. N/3) {
        for(five in 0..N/5) {
            val weight = (3 * three) + (5 * five)
            if(weight == N) {
                answer = min(three + five, answer)
            }
        }
    }
    if(answer == Int.MAX_VALUE) { answer = -1 }

    // 출력
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}