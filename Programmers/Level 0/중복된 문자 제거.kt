class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""

        val tmp: MutableSet<String> = mutableSetOf()
        my_string.forEach { ch ->
            tmp.add(ch.toString())
        }

        tmp.forEach { str ->
            answer += str
        }

        return answer
    }
}