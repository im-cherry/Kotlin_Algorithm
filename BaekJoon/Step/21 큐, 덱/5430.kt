import kotlin.collections.ArrayDeque

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val p: String = br.readLine()  // 수행할 함수
        val n: Int = br.readLine().toInt()  // 배열의 개수

        val deque = ArrayDeque<Int>()
        br.readLine().trim('[', ']').split(",").forEach {
            it.toIntOrNull()?.let { num ->
                deque.add(num)
            }
        }

        // 알고리즘
        var isError: Boolean = false
        var isReversed: Boolean = false
        for(ch in p) {
            when(ch) {
                'R' -> isReversed = !isReversed
                'D' -> {
                    if(deque.isEmpty()) {
                        isError = true
                        break
                    }
                    if(isReversed) {
                        deque.removeLast()
                    } else {
                        deque.removeFirst()
                    }
                }
            }
        }

        if(isError) {
            bw.write("error\n")
        } else {
            bw.write("[")
            if(deque.isNotEmpty()) {
                if(isReversed) {
                    while(deque.size > 1) {
                        bw.write("${deque.removeLast()},")
                    }
                    bw.write("${deque.removeLast()}")
                } else {
                    while(deque.size > 1) {
                        bw.write("${deque.removeFirst()},")
                    }
                    bw.write("${deque.removeFirst()}")
                }
            }
            bw.write("]\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}