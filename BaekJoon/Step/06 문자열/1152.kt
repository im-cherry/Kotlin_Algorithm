fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val sentence: String = br.readLine().trim()

    if(sentence.isEmpty()) {
        bw.write("0")
    } else {
        bw.write("${sentence.split(" ").size}")
    }

    bw.flush()
    bw.close()
    br.close()
}