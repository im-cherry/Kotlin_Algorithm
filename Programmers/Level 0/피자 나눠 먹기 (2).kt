class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        var pieces: Int = 6
        while(pieces % n != 0) {
            pieces += 6
        }
        answer = pieces / 6

        return answer
    }
}