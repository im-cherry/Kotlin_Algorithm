class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        val list: MutableList<Int> = mutableListOf<Int>()
        s.split(" ").forEach { str ->
            val num: Int? = str.toIntOrNull()
            if(num != null) {
                list.add(num)
            } else {
                list.removeLast()
            }
        }

        list.forEach { num ->
            answer += num
        }

        return answer
    }
}