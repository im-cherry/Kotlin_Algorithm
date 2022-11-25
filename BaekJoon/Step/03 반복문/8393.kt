fun main() {
    // 입력
    val n: Int = readLine()!!.toInt()

    // 알고리즘
    var sum: Int = 0
    for(i in 1..n) {
        sum += i
    }

    // 출력
    println(sum)
}