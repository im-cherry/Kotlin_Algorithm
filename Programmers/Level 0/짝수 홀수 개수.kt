class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        var oddCnt: Int = 0
        var evenCnt: Int = 0
        num_list.forEach { num ->
            if(num % 2 == 0) {
                evenCnt++
            } else {
                oddCnt++
            }
        }
        answer = intArrayOf(evenCnt, oddCnt)

        return answer
    }
}