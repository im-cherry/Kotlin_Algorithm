class Solution {
    fun solution(denum1: Int, num1: Int, denum2: Int, num2: Int): IntArray {
        var answer: IntArray = IntArray(2){ 0 }

        var denum: Int = (denum1 * num2) + (denum2 * num1)
        var num: Int = num1 * num2

        val min: Int = if(denum > num) num else denum
        var i: Int = 2
        while(i <= min) {
            if((denum % i == 0) && (num % i == 0)) {
                denum /= i
                num /= i
                i--
            }
            i++
        }

        answer[0] = denum
        answer[1] = num

        return answer
    }
}