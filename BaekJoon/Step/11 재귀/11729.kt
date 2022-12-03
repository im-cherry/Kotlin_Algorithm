import kotlin.math.pow

val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

fun main() {
    val N: Int = br.readLine().toInt()

    val K: Int = (2.0).pow(N.toDouble()).toInt() - 1
    bw.write("${K}\n")
    hanoi(N, 1, 2, 3)

    bw.flush()
    bw.close()
    br.close()
}

private fun hanoi(N: Int, start: Int, mid: Int, end: Int) {
    if(N == 1) {
        bw.write("${start} ${end}\n")
        return
    }

    hanoi(N - 1, start, end, mid)
    bw.write("${start} ${end}\n")
    hanoi(N - 1, mid, start, end)
}