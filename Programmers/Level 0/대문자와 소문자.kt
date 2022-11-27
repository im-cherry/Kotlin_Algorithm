class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""

        my_string.forEach { ch ->
            when(ch) {
                in 'a'..'z' -> {
                    answer += ch.uppercaseChar().toString()
                }
                in 'A'..'Z' -> {
                    answer += ch.lowercaseChar().toString()
                }
            }
        }

        return answer
    }
}