import kotlin.math.ceil

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input: List<String> = br.readLine().split(" ")

    // 알고리즘
    val A: Double = input[0].toDouble()  // 낮에 A 미터 올라감
    val B: Double = input[1].toDouble()  // 밤에 B 미터 미끄러짐
    val V: Double = input[2].toDouble()  // 높이가 V 미터인 나무 막대
    val answer :Int = ceil((V - A)/(A - B)).toInt() + 1  // 나무 막대를 올라가는데 걸리는 시간(일)

    // 출력
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}