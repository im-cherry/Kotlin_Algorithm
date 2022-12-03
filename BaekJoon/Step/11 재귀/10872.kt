fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N: Int = br.readLine().toInt()
    bw.write("${factorial(N)}")

    bw.flush()
    bw.close()
    br.close()
}

private fun factorial(n: Int): Int {
    return when {
        n < 2 -> 1
        else -> n * factorial(n - 1)
    }
}