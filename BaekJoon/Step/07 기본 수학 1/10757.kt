import java.math.BigInteger

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input: List<String> = br.readLine().split(" ")
    val A: BigInteger = input[0].toBigInteger()
    val B: BigInteger = input[1].toBigInteger()

    // 알고리즘
    val answer: BigInteger = A + B

    // 출력
    bw.write("${answer}")

    bw.flush()
    bw.close()
    br.close()
}