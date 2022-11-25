fun main() {
    // 입력
    val input: List<String> = readLine()!!.split(" ")

    // 알고리즘
    val A: Int = input[0].toInt()
    val B: Int = input[1].toInt()
    val C: Int = input[2].toInt()

    // 출력
    println((A + B) % C)
    println(((A % C) + (B % C)) % C)
    println((A * B) % C)
    println(((A % C) * (B % C)) % C)
}