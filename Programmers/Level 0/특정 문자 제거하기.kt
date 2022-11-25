class Solution {
    fun solution(my_string: String, letter: String): String {
        var answer: String = ""

        my_string.forEach { ch ->
            val tmp: String = ch.toString()
            if(tmp != letter) {
                answer += tmp
            }
        }

        return answer
    }
}