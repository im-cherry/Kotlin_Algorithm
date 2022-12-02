import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val maxHeap = PriorityQueue<Int>(Collections.reverseOrder())
    var minHeap = PriorityQueue<Int>()
    repeat(br.readLine().toInt()) {
        val num: Int = br.readLine().toInt()

        if(maxHeap.size == minHeap.size) {
            maxHeap.offer(num)
        } else {
            minHeap.offer(num)
        }

        if(maxHeap.isNotEmpty() && minHeap.isNotEmpty()) {
            if(maxHeap.peek() > minHeap.peek()) {
                val tmp = minHeap.poll()
                minHeap.offer(maxHeap.poll())
                maxHeap.offer(tmp)
            }
        }
        bw.write("${maxHeap.peek()}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}