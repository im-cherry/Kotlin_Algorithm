class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        val size: Int = num2 - num1 + 1
        var answer: IntArray = IntArray(size) { 0 }

        var i: Int = 0
        for(index in num1..num2) {
            answer[i++] = numbers[index]
        }

        return answer
    }
}