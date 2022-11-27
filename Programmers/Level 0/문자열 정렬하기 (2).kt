class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""

        answer = my_string.lowercase().split("").sorted().joinToString("")

        return answer
    }
}