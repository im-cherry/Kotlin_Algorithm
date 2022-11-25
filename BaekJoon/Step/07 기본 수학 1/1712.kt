import java.lang.Exception

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input: List<String> = br.readLine().split(" ")

    // 알고리즘
    val A: Int = input[0].toInt()  // 고정 비용
    val B: Int = input[1].toInt()  // 가변 비용
    val C: Int = input[2].toInt()  // 총수입 > 고정비용 + 가변 비용

    try {
        val result: Int = A / (C - B)
        val answer: Int = if(result >= 0) result + 1 else -1
        bw.write("$answer")
    } catch(e: Exception) {
        bw.write("-1")
    }

    bw.flush()
    bw.close()
    br.close()
}