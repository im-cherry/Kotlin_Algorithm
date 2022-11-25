class Solution {
    fun solution(strlist: Array<String>): IntArray {
        val size: Int = strlist.size
        var answer: IntArray = IntArray(size) { 0 }

        strlist.forEachIndexed { index, str ->
            answer[index] = str.length
        }

        return answer
    }
}