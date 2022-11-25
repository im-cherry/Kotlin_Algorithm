fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N: String = br.readLine().padStart(2, '0')
    var newN = N

    var answer: Int = 0
    do {
        val one = newN[0].toString().toInt()  // 첫번째 자리
        val two = newN[1].toString().toInt()  // 두번째 자리
        val sum = (one + two).toString().padStart(2, '0')

        newN = "${newN[1]}${sum[1]}"
        answer++
    } while(N != newN)
    bw.write("${answer}\n")

    bw.flush()
    bw.close()
    br.close()
}