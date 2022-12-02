import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val queue: Queue<Int> = LinkedList()  // 버퍼
    val N: Int = br.readLine().toInt()  // 버퍼의 크기
    Loop@while(true) {
        val data: Int = br.readLine().toInt()
        when(data) {
            -1 -> {
                break@Loop
            }
            0 -> {
                queue.poll()
            }
            else -> {
                if(queue.size < N) {
                    queue.offer(data)
                }
            }
        }
    }

    if(queue.isEmpty()) {
        bw.write("empty")
    } else {
        bw.write(queue.joinToString(" "))
    }

    bw.flush()
    bw.close()
    br.close()
}