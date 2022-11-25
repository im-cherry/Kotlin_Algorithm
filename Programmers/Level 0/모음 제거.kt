class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""

        my_string.forEach { ch ->
            val alphabet: String = ch.toString()

            if(alphabet !in "aeiou") {
                answer += alphabet
            }
        }

        return answer
    }
}