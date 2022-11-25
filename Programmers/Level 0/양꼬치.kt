class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0

        val service: Int = n / 10
        answer = (12000 * n) + (2000 * (k - service))

        return answer
    }
}