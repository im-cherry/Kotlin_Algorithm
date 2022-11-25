fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var maxValue: Int = 0  // 최소값
    var maxIndex: Int = -1  // 최소값의 위치

    // 알고리즘
    repeat(9) {
        val num: Int = br.readLine().toInt()

        if(num > maxValue) {
            maxValue = num
            maxIndex = it + 1
        }
    }

    bw.write("${maxValue}\n${maxIndex }\n")

    bw.flush()
    bw.close()
    br.close()
}