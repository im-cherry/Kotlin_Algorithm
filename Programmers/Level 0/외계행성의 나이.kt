class Solution {
    fun solution(age: Int): String {
        var answer: String = ""

        val ageRule: Array<String> = arrayOf<String>("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")

        age.toString().forEach { ch ->
            answer += ageRule[ch.toString().toInt()]
        }


        return answer
    }
}