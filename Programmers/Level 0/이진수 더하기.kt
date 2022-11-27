class Solution {
    fun solution(bin1: String, bin2: String): String {
        var answer: String = ""

        val result: Int = bin1.toInt(2) + bin2.toInt(2)
        answer = result.toString(2)

        return answer
    }
}