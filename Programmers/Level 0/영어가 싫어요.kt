class Solution {
    fun solution(numbers: String): Long {
        var answer: Long = 0

        var alphabetNumber: String = numbers
        val map: Map<String, String> = mapOf(
            "zero" to "0", "one" to "1", "two" to "2", "three" to "3", "four" to "4",
            "five" to "5", "six" to "6", "seven" to "7", "eight" to "8", "nine" to "9"
        )

        map.forEach { key, value ->
            alphabetNumber = alphabetNumber.replace(key, value)
        }

        answer = alphabetNumber.toLong()

        return answer
    }
}