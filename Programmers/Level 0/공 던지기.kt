class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0

        var index: Int = 0
        var cnt: Int = k
        while(cnt != 0) {
            if(index >= numbers.size) {
                index -= numbers.size
            }
            index += 2
            cnt--
        }
        answer = index - 1

        return answer
    }
}