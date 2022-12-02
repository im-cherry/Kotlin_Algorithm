import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N: Int = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    for(i in 1..N) {
        queue.offer(i)
    }

    while(queue.size != 1) {
        // 제일 위에 있는 카드 버리기
        queue.poll()

        // 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮기기
        queue.offer(queue.poll())
    }
    bw.write("${queue.peek()}")

    bw.flush()
    bw.close()
    br.close()
}