import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val stack: Stack<Int> = Stack()
    repeat(br.readLine().toInt()) {
        val str: List<String> = br.readLine().split(" ")
        when(str[0]) {
            "push" -> {
                stack.push(str[1].toInt())
            }
            "pop" -> {
                if(stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.pop()}\n")
                }
            }
            "size" -> {
                bw.write("${stack.size}\n")
            }
            "empty" -> {
                if(stack.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            "top" -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${stack.peek()}\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
    br.close()
}