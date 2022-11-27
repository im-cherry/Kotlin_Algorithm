class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer: Int = 0

        var result: Int = n
        repeat(t) {
            result *= 2
        }
        answer = result


        return answer
    }
}