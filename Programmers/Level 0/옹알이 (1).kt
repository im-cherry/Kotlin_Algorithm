class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0

        val words: Array<String> = arrayOf("aya", "ye", "woo", "ma")

        babbling.forEach {
            var str: String = it
            words.forEach Loop@{ word ->
                if(str.indexOf(word) != -1) {
                    str = str.replace(word, "*")
                    if(str.replace("*", "") == "") {
                        answer++
                        return@Loop
                    }
                }
            }
        }

        return answer
    }
}