import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        val num: Double = n.toDouble()
        val result: Double = sqrt(num)
        answer = if(num % result == 0.0) 1 else 2

        return answer
    }
}