class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0

        array.forEach { value ->
            if(value == n) {
                answer++
            }
        }

        return answer
    }
}