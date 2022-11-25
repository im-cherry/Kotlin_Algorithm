class Solution {
    fun solution(dot: IntArray): Int {
        var answer: Int = 0

        val x: Int = dot[0]
        val y: Int = dot[1]
        answer = when {
            (x > 0 && y > 0) -> 1
            (x < 0 && y > 0) -> 2
            (x < 0 && y < 0) -> 3
            else -> 4
        }

        return answer
    }
}