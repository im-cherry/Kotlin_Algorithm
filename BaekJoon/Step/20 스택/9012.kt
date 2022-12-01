import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val stack: Stack<Char> = Stack()
    repeat(br.readLine().toInt()) {
        val input = br.readLine().toCharArray()

        input.forEach { ch ->
            if (stack.isEmpty()) {
                stack.push(ch)
            } else {
                when {
                    ch == ')' && stack.peek() == '(' -> stack.pop()
                    else -> stack.push(ch)
                }
            }
        }

        if(stack.isEmpty()) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
        stack.clear()
    }

    bw.flush()
    bw.close()
    br.close()
}