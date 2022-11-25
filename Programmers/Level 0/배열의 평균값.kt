class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0

        val size: Int = numbers.size
        numbers.forEach { number ->
            answer += number
        }
        answer = answer / size

        return answer
    }
}