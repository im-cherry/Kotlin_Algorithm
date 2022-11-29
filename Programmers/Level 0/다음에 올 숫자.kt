class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0

        val first: Int = common[1] - common[0]
        val second: Int = common[2] - common[1]
        if(first == second) {
            val num: Int = first
            answer = common[common.lastIndex] + num
        } else {
            val num: Int = second / first
            answer = common[common.lastIndex] * num
        }

        return answer
    }
}