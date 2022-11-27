class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        val list: MutableList<Int> = mutableListOf<Int>()
        numlist.forEach { num ->
            if(num % n == 0) {
                list.add(num)
            }
        }

        answer = IntArray(list.size) { 0 }
        list.forEachIndexed { index, value ->
            answer[index] = value
        }

        return answer
    }
}