class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0

        var coupon: Int = chicken
        while(coupon >= 10) {
            coupon -= 10

            answer++
            coupon++
        }

        println(answer)

        return answer
    }
}