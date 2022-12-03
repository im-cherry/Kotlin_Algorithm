import java.util.PriorityQueue

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input: List<String> = br.readLine().split(" ")
    val N: Int = input[0].toInt()  // 듣도 못한 사람의 수
    val M: Int = input[1].toInt()  // 보도 못한 사람의 수

    val map = HashMap<String, Boolean>()  // 듣도 못한 사람
    repeat(N) {
        map.put(br.readLine(), true)
    }

    val answer = PriorityQueue<String>()  // 듣도 보도 못한 사람
    // 보도 못한 사람
    repeat(M) {
        val person: String = br.readLine()
        if(map.containsKey(person)) {
            answer.offer(person)
        }
    }

    bw.write("${answer.size}\n")
    while(answer.isNotEmpty()) {
        bw.write("${answer.poll()}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}