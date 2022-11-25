fun main() {
    var price: Int = 0  // 내가 계산한 금액

    val X: Int = readLine()!!.toInt()  // 총 금액
    val N: Int = readLine()!!.toInt()  // 물건의 종류의 수
    for(n in 1..N) {
        val input: List<String> = readLine()!!.split(" ")
        val a = input[0].toInt()  // 물건의 가격
        val b = input[1].toInt()  // 물건의 개수

        price += a * b
    }

    val answer = if (price == X) "Yes" else "No"
    println(answer)
}