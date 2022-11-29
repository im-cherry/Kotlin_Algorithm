class Solution {
    fun solution(M: Int, N: Int): Int {
        var answer: Int = 0

        // 세로로 자르기 : a
        // 가로로 자르기 : b
        val a: Int = M - 1
        val b: Int = (N - 1) * (a + 1)
        answer = a + b

        return answer
    }
}