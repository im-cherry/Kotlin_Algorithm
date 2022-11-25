fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val k: Int = br.readLine().toInt()  // k층
        val n: Int = br.readLine().toInt()  // n호

        bw.write("${solution(k, n)}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

// a층 b호
fun solution(a: Int, b: Int): Int {
    return when {
        (a == 0) -> b
        else -> {
            var result: Int = 0
            for (i in 1..b) {
                result += solution(a - 1, i)
            }
            result
        }
    }
}