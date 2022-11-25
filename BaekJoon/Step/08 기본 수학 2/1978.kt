fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: Int = br.readLine().toInt()  // N개
    val input: List<String> = br.readLine().split(" ")

    var answer: Int = 0
    Loop@for(n in 0 until N) {
        val num: Int = input[n].toInt()

        if(num == 1) continue@Loop
        if(num == 2) {
            answer++
            continue@Loop
        }

        if (num % 2 == 0) continue@Loop

        for (i in 3 until num) {
            if (num % i == 0) continue@Loop
        }
        answer++
    }
    println(answer)

    bw.flush()
    bw.close()
    br.close()
}