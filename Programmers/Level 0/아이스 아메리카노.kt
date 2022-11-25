class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val remain: Int = money % 5500
        val cnt: Int = money / 5500

        answer = intArrayOf(cnt, remain)

        return answer
    }
}