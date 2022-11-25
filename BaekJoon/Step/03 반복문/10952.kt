import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    while(true) {
        val token = StringTokenizer(br.readLine())
        val A: Int = token.nextToken().toInt()
        val B: Int = token.nextToken().toInt()

        if(A + B == 0) break
        bw.write("${A + B}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}