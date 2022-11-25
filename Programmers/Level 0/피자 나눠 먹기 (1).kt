class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        val piece: Int = 7
        answer = if (n % piece == 0) n / piece else n / piece + 1

        return answer
    }
}