class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0

        array.forEach { value ->
            if(value > height) {
                answer++
            }
        }

        return answer
    }
}