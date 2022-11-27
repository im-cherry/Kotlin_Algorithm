class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var max: Int = 0
        var maxIndex: Int = 0

        array.forEachIndexed { index, value ->
            if(value > max) {
                max = value
                maxIndex = index
            }
        }

        answer = intArrayOf(max, maxIndex)

        return answer
    }
}