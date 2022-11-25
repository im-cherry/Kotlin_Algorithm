class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = IntArray(numbers.size, { 0 })

        numbers.forEachIndexed { index, number ->
            answer[index] = number * 2
        }

        return answer
    }
}