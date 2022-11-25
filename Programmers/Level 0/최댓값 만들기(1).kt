class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0

        val sortedNumbers = numbers.sorted()
        val size = numbers.size
        answer = sortedNumbers[size - 1] * sortedNumbers[size - 2]

        return answer
    }
}