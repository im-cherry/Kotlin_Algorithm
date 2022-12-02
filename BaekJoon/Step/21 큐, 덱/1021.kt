import kotlin.collections.ArrayDeque

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val input: List<String> = br.readLine().split(" ")
    val N: Int = input[0].toInt()  // 큐의 크기
    val M: Int = input[1].toInt()  // 뽑아내려고 하는 수의 개수

    val deque = ArrayDeque<Int>()
    for(i in 1..N) {
        deque.add(i)
    }

    // 알고리즘
    var cnt: Int = 0
    br.readLine().split(" ").forEach {
        val value: Int = it.toInt()  // 뽑으려고 하는 수의 위치

        val index: Int = deque.indexOf(value)
        val leftIndex: Int = index  // 왼쪽에서부터 인덱스 위치
        val rightIndex: Int = deque.size - index - 1  // 오른쪽에서부터 인덱스 위치

        if(leftIndex <= rightIndex) {  // 왼쪽으로 이동
            while(true) {
                val tmp: Int = deque.first()
                if(tmp == value) {
                    deque.removeFirst()
                    break
                }
                deque.addLast(deque.removeFirst())
                cnt++
            }
        } else {  // 오른쪽으로 이동
            while(true) {
                val tmp: Int = deque.first()
                if(tmp == value) {
                    deque.removeFirst()
                    break
                }
                deque.addFirst(deque.removeLast())
                cnt++
            }
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    br.close()
}