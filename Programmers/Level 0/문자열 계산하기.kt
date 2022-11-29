class Solution {
    fun solution(my_string: String): Int {
        val list: List<String> = my_string.split(" ")
        var answer: Int = list[0].toString().toInt()
        var op: String = ""

        for(index in 1 until list.size) {
            val current: Int? = list[index].toIntOrNull()

            if(current == null) {
                op = list[index]
            } else {
                answer = if(op == "+") answer + current!! else answer - current!!
            }
        }

        return answer
    }
}