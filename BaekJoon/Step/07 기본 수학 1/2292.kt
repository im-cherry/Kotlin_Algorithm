fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: Int = br.readLine().toInt()

    // 알고리즘
    var num: Int = 1
    var i: Int = 1
    while(N > num) {
        num += (6 * i)
        i++
    }

    // 출력
    bw.write("$i")

    bw.flush()
    bw.close()
    br.close()
}