class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        repeat(n) {
            answer += 1
            while(isThree(answer)) {
                answer += 1
            }
        }

        return answer
    }

    private fun isThree(num: Int): Boolean {
        return num % 3 == 0 || "3" in num.toString()
    }
}