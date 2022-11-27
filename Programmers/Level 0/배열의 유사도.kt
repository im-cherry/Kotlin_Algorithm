class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0

        s1.forEach { word1 ->
            s2.forEach { word2 ->
                if(word1 == word2) {
                    answer++
                }
            }
        }

        return answer
    }
}