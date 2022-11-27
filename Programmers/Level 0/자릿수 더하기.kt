class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        n.toString().forEach { ch ->
            answer += ch.toString().toInt()
        }

        return answer
    }
}