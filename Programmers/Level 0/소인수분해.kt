class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val result: MutableSet<Int> = mutableSetOf<Int>()
        var num: Int = n
        var i: Int = 2
        while(i <= n) {
            if(num % i == 0) {
                num /= i
                result.add(i)
                continue
            }
            i++
        }

        answer = IntArray(result.size) { 0 }
        result.forEachIndexed { index, value ->
            answer[index] = value
        }

        return answer
    }
}