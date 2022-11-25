class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0

        answer = when {
            (price < 100000) -> price
            (price < 300000) -> (price * 0.95).toInt()
            (price < 500000) -> (price * 0.9).toInt()
            else -> (price * 0.8).toInt()
        }

        return answer
    }
}