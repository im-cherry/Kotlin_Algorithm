class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0

        for(num in i..j) {
            num.toString().forEach { value ->
                if(value.toString() == k.toString()) {
                    answer++
                }
            }
        }

        return answer
    }
}