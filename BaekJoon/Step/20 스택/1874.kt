import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val sb = StringBuilder()

    var num: Int = 1
    val stack: Stack<Int> = Stack()
    var isPossible: Boolean = true
    repeat(br.readLine().toInt()) {
        val input: Int = br.readLine().toInt()

        while(stack.isEmpty() || stack.peek() < input) {
            stack.push(num++)
            sb.appendLine("+")
        }

        if(stack.peek() == input) {
            stack.pop()
            sb.appendLine("-")
            return@repeat
        }

        isPossible = false
    }

    if(isPossible){
        bw.write(sb.toString())
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
    br.close()
}