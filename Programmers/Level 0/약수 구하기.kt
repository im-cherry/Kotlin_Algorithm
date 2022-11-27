class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val tmp: MutableSet<Int> = mutableSetOf()
        tmp.add(1)
        for(i in 2..n) {
            if(n % i == 0) {
                tmp.add(i)
            }
        }

        answer = IntArray(tmp.size) { 0 }
        tmp.forEachIndexed { index, value ->
            answer[index] = value
        }

        return answer
    }
}