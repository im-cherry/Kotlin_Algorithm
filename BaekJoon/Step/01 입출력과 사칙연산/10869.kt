fun main() {
    // 입력
    val input = readLine()!!.split(" ")

    // 알고리즘
    val A: Int = input[0].toInt()
    val B: Int = input[1].toInt()

    // 출력
    println(A + B)
    println(A - B)
    println(A * B)
    println(A / B)
    println(A % B)
}