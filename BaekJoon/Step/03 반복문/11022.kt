import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val A: Int = token.nextToken().toInt()
        val B: Int = token.nextToken().toInt()
        val C = A + B

        bw.write("Case #${it + 1}: $A + $B = ${C}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}