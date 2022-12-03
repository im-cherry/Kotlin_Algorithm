fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val n: Int = br.readLine().toInt()
    bw.write("${fibo(n)}")

    bw.flush()
    bw.close()
    br.close()
}

private fun fibo(n: Int): Int {
    return when(n) {
        0, 1 -> n
        else -> fibo(n-1) + fibo(n-2)
    }
}