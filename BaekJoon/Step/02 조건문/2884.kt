fun main() {
    // 입력
    val input: List<String> = readLine()!!.split(" ")

    // 알고리즘
    var hour: Int = input[0].toInt()
    var minute: Int = input[1].toInt()

    if (minute >= 45) {
        minute -= 45
    } else {
        hour = if (hour == 0) 23 else hour - 1
        minute = 60 - (45 - minute)
    }

    // 출력
    println("$hour $minute")
}