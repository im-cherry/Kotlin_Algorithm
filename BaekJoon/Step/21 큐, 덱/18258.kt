import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val queue: Queue<String> = LinkedList()
    repeat(br.readLine().toInt()) {
        val input: List<String> = br.readLine().split(" ")

        when(input[0]) {
            "push" -> {
                queue.offer(input[1])
            }
            "pop" -> {
                if(queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.poll()}\n")
                }
            }
            "size" -> {
                bw.write("${queue.size}\n")
            }
            "empty" -> {
                if(queue.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            "front" -> {
                if(queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.first()}\n")
                }
            }
            "back" -> {
                if(queue.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    bw.write("${queue.last()}\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
    br.close()
}