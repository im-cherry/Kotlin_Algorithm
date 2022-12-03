fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val answer: MutableSet<String> = mutableSetOf()  // 부분 문자열
    val str: String = br.readLine()

    for(i in 1..str.length) {
        makeSubString( i, str, answer)
    }
    bw.write("${answer.size}")

    bw.flush()
    bw.close()
    br.close()
}

private fun makeSubString(cnt: Int, str: String, answer: MutableSet<String>): Unit {
    for(i in 0..str.length-cnt) {
        answer.add(str.substring(i, i + cnt))
    }
}