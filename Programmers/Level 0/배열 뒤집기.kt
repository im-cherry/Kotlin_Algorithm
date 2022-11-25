class Solution {
    fun solution(num_list: IntArray): IntArray {
        val size: Int = num_list.size
        var answer: IntArray = IntArray(size) { 0 }

        for(index in 0 until size) {
            answer[index] = num_list[size - index - 1]
        }

        return answer
    }
}