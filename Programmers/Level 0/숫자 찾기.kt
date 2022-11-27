class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0

        val index: Int = num.toString().indexOf(k.toString())
        answer = if (index == -1) -1 else index + 1

        return answer
    }
}