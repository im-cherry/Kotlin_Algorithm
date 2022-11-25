class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0

        my_string.forEach { ch ->
            val num: Int? = ch.toString().toIntOrNull()
            if(num != null) {
                answer += num
            }
        }

        return answer
    }
}