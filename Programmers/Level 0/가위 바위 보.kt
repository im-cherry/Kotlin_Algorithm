class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""

        rsp.forEach { ch ->
            when(ch) {
                '2' -> answer += "0"
                '0' -> answer += "5"
                '5' -> answer += "2"
            }
        }

        return answer
    }
}