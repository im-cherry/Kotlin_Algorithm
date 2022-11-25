class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""

        my_string.forEach { ch ->
            repeat(n) {
                answer += ch.toString()
            }
        }

        return answer
    }
}