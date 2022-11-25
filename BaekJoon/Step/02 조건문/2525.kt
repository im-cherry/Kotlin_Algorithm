fun main() {
    // 입력
    val input: List<String> = readLine()!!.split(" ")
    var A: Int = input[0].toInt()  // 현재 hour
    var B: Int = input[1].toInt()  // 현재 minute
    val C: Int = readLine()!!.toInt()  // 요리 시간 (min)

    // 알고리즘
    val hour: Int = C / 60  // 요리 hour
    val min: Int = C % 60  // 요리 min

    // 분 계산
    B += min
    if(B >= 60) {
        A += 1
        B -= 60
    }

    // 시 계산
    A += hour
    if (A >= 24) {
        A -= 24
    }

    // 출력
    println("$A $B")
}