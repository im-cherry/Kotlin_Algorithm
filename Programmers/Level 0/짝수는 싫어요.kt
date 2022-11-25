class Solution {
    fun solution(n: Int): IntArray {
        val len: Int = if(n % 2 == 0) n / 2 else n / 2 + 1
        var answer: IntArray = IntArray(len, { 0 })

        answer[0] = 1
        for(index in 1 until len) {
            answer[index] = answer[index-1] + 2
        }

        return answer
    }
}