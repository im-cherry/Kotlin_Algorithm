class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""

        answer += my_string.substring(0, num1)
        answer += my_string[num2].toString()
        answer += my_string.substring(num1 + 1, num2)
        answer += my_string[num1].toString()
        answer += my_string.substring(num2 + 1)

        return answer
    }
}