import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val stack: Stack<Int> = Stack()
    repeat(br.readLine().toInt()) {
        val input: Int = br.readLine().toInt()

        if(input == 0) {
            stack.pop()
        } else {
            stack.push(input)
        }
    }

    var answer: Int = 0
    while(stack.isNotEmpty()) {
        answer += stack.pop()
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}