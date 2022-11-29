class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = Array<String>(quiz.size){ " " }

        quiz.forEachIndexed { index, value ->
            val expression: List<String> = value.split(" ")
            val num1: Int = expression[0].toInt()
            val op: String = expression[1]
            val num2: Int = expression[2].toInt()
            val result: Int = expression[4].toInt()

            when(op) {
                "+" -> answer[index] = if(num1 + num2 == result) "O" else "X"
                "-" -> answer[index] = if(num1 - num2 == result) "O" else "X"
            }
        }

        return answer
    }
}