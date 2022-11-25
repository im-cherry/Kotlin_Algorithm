class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0

        var slices: Int = slice
        while(slices / n < 1) {
            slices += slice
        }
        answer = slices / slice

        return answer
    }
}