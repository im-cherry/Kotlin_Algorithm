import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input: List<String> = br.readLine().split(" ")
    val M: Int = input[0].toInt()
    val N: Int = input[1].toInt()

    // 알고리즘
    Loop@for(i in M..N) {
        if(i == 1) { continue }
        if(i == 2) {
            bw.write("${i}\n")
            continue
        }
        if(i % 2 == 0) { continue }

        for(j in 3..sqrt(i.toDouble()).toInt() step 2) {
            if(i % j == 0) { continue@Loop }
        }
        bw.write("${i}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}