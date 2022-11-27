class Solution {
    fun solution(order: Int): Int {
        var answer: Int = 0

        order.toString().forEach { ch ->
            if(ch in "369") {
                answer++
            }
        }

        return answer
    }
}