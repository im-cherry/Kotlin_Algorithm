fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val N: String = br.readLine()!!
    val numList: List<String> = br.readLine().split(" ")
    val v: String = br.readLine()!!.toString()

    // 알고리즘
    var answer: Int = 0
    numList.forEach { num ->
        if(num == v) { answer++ }
    }
    bw.write("${answer}\n")

    bw.flush()
    bw.close()
    br.close()
}