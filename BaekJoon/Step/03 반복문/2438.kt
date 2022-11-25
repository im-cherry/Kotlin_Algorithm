fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 알고리즘
    val N: Int = br.readLine().toInt()
    for(n in 1..N) {
        repeat(n) {
            bw.write("*")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
