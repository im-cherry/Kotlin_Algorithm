class Solution {
    fun solution(my_string: String): IntArray {

        val list: MutableList<Int> = mutableListOf()
        my_string.forEach { ch ->
            val num: Int? = ch.toString().toIntOrNull()
            if(num != null) {
                list.add(num)
            }
        }
        list.sort()

        val answer: IntArray = IntArray(list.size) { 0 }
        list.forEachIndexed { index, num ->
            answer[index] = num
        }

        return answer
    }
}