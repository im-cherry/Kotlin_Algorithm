fun main() {
    // 입력
    val year: Int = readLine()!!.toInt()

    // 알고리즘
    var answer: Int = 0
    if(year % 4 == 0) {
        if(year % 100 != 0) answer = 1
        else if(year % 400 == 0) answer = 1
    }

    // 출력
    println(answer)
}