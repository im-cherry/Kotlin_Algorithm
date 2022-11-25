fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val X: Int = br.readLine().toInt()

    // 알고리즘
    var cnt: Int = 1
    var answer: String = ""

    var i: Int = 1
    Loop@ while (true) {
        for (j in 1..i) {
            if (cnt == X) {
                answer = if (i % 2 == 0) "${j}/${i - j + 1}" else "${i - j + 1}/${j}"
                break@Loop
            }
            cnt++
        }
        i++
    }

    // 출력
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}