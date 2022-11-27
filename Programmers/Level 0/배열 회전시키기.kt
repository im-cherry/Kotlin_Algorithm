class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val size: Int = numbers.size
        var answer: IntArray = IntArray(size) { 0 }

        if(direction == "right") {
            answer[0] = numbers.last()
            for(i in 1 until size) {
                answer[i] = numbers[i-1]
            }
        } else {
            for(i in 1 until size) {
                answer[i-1] = numbers[i]
            }
            answer[size-1] = numbers.first()
        }

        return answer
    }
}