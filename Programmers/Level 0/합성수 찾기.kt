class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        Loop@for(i in 1..n) {
            var cnt: Int = 1
            for(j in 1..i) {
                if(cnt >= 3) {
                    answer++
                    continue@Loop
                }
                if(i % j == 0) {
                    cnt++
                }
            }
        }

        return answer
    }
}