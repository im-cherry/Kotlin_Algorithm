class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 2


        Loop@for(i in 0 until dic.size) {
            val word: String = dic[i]
            for(j in 0 until spell.size) {
                val alphabet: String = spell[j]
                if(alphabet !in word) {
                    continue@Loop
                }
            }
            answer = 1
            break
        }

        return answer
    }
}