import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val stack: Stack<Char> = Stack()
    while(true) {
        val input = br.readLine()
        if(input == ".") break

        input.toCharArray().forEach { ch ->
            when(ch) {
                '(' -> {
                    stack.push(ch)
                }
                ')' -> {
                    if(stack.isNotEmpty() && stack.peek() == '(') {
                        stack.pop()
                    } else {
                        stack.push(ch)
                    }
                }
                '[' -> {
                    stack.push(ch)
                }
                ']' -> {
                    if(stack.isNotEmpty() && stack.peek() == '[') {
                        stack.pop()
                    } else {
                        stack.push(ch)
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
        stack.clear()
    }

    bw.flush()
    bw.close()
    br.close()
}