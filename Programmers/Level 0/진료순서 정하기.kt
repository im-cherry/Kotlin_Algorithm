class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = IntArray(emergency.size)

        var sortedEmergency: IntArray = emergency.copyOf()
        sortedEmergency = sortedEmergency.sortedArrayDescending()
        sortedEmergency.forEachIndexed { index, value ->
            answer[emergency.indexOf(value)] = index + 1
        }

        return answer
    }
}