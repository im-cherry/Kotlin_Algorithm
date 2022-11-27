class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0

        array.forEach { value ->
            value.toString().forEach { ch ->
                if(ch == '7') answer++
            }
        }

        return answer
    }
}