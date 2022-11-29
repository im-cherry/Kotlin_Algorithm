class Solution {
    fun solution(A: String, B: String): Int {
        if(A == B) return 0

        var answer: Int = 0

        val len: Int = A.length
        var newString: String = A
        for(i in 0 until len) {
            newString = newString.substring(len - 1, len) + newString.substring(0, len - 1)
            answer++
            if(newString == B) {
                break
            }
        }
        answer = if (answer == len) -1 else answer

        return answer
    }
}