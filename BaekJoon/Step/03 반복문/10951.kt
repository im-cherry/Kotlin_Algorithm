import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    while(true) {
        try {
            val token = StringTokenizer(br.readLine())

            val A: Int = token.nextToken().toInt()
            val B: Int = token.nextToken().toInt()
            bw.write("${A + B}\n")
        } catch(e: Exception) {
            break
        }
    }

    bw.flush()
    bw.close()
    br.close()
}