import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val queue: Queue<IntArray> = LinkedList()  // (인덱스, 문서의 중요도)

        // 입력
        val input: List<String> = br.readLine().split(" ")
        val N: Int = input[0].toInt()  // 문서의 개수 N
        val M: Int = input[1].toInt()  // 몇번째로 인쇄되었는지 궁금한 문서의 번호
        br.readLine().split(" ").forEachIndexed { index, value ->
            queue.offer(intArrayOf(index, value.toInt()))
        }

        // 알고리즘
        var cnt: Int = 0
        Loop@while(queue.isNotEmpty()) {
            // 1. 현재 Queue의 가장 앞에 있는 문서의 중요도를 확인한다.
            val currentDocument = queue.poll()

            for(document in queue) {
                // 2-1. 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 있다면 Queue 의 가장 뒤에 재배치한다.
                if(document[1] > currentDocument[1]) {
                    queue.offer(currentDocument)
                    continue@Loop
                }
            }

            // 2-2. 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 없다면 인쇄한다.
            cnt++
            if(currentDocument[0] == M) {
                break
            }
        }
        bw.write("${cnt}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
