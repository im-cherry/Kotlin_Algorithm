class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        var i: Int = 1
        var factorial: Int = 1
        while(true) {
            if(n < factorial) {
                break
            }

            i++
            factorial *= i
        }
        answer = i - 1

        return answer
    }
}