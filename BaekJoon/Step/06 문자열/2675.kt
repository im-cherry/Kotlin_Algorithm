fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val line: List<String> = br.readLine().split(" ")

        val R = line[0].toInt()
        line[1].forEach { ch ->
            repeat(R) {
                bw.write("$ch")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    br.close()
}