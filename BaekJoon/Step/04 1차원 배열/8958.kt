fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val scores: List<String> = br.readLine().split("")

        var sum: Int = 0
        var tmp: Int = 1
        scores.forEach { score ->
            if(score == "O") {
                sum += tmp++
            } else {
                tmp = 1
            }
        }
        bw.write("${sum}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}