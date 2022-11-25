fun main() {
    // 입력
    val input1: String = readLine()!!
    val input2: String = readLine()!!

    // 알고리즘 및 출력
    for(i in input2.length - 1 downTo 0) {
        println(input1.toInt() * input2[i].toString().toInt())
    }
    println(input1.toInt() * input2.toInt())
}