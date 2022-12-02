import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input: List<String> = br.readLine().split(" ")
    val N: Int = input[0].toInt()  // 1번부터 N번까지 N명의 사람이 원을 이루어 앉아 있음
    val K: Int = input[1].toInt()  // K번째 사람 제거

    val queue: Queue<Int> = LinkedList()
    for(i in 1..N) {
        queue.offer(i)
    }

    var index: Int = 1
    val answer: Queue<Int> = LinkedList()
    while(queue.isNotEmpty()) {
        val n: Int = queue.poll()

        if(index == K) {
            answer.offer(n)
            index = 1
        } else {
            queue.offer(n)
            index++
        }
    }
    bw.write("<")
    bw.write(answer.joinToString(", "))
    bw.write(">")

    bw.flush()
    bw.close()
    br.close()
}