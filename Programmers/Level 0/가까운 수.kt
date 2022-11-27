class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 100

        var distance: Int = 100
        array.forEach { value ->
            val tmp: Int = if(value - n > 0) value - n else n - value
            when {
                distance == tmp -> {
                    answer = if(value < answer) value else answer
                }
                distance > tmp -> {
                    distance = tmp
                    answer = value
                }
            }
        }

        return answer
    }
}