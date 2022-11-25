class Solution {
    fun solution(balls: Int, share: Int): Int {
        var answer: Int = 1

        var nFac = 1.toBigInteger()
        for(i in 1..balls) {
            nFac *= i.toBigInteger()
        }

        var nmFac = 1.toBigInteger()
        for(i in 1..balls-share) {
            nmFac *= i.toBigInteger()
        }

        var mFac = 1.toBigInteger()
        for(i in 1..share) {
            mFac *= i.toBigInteger()
        }

        answer = (nFac / (nmFac * mFac)).toInt()

        return answer
    }
}