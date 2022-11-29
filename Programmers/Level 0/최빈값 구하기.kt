class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0

        val map: MutableMap<Int, Int> = mutableMapOf()
        var max: Int = 0
        array.forEach { value ->
            map[value] = map[value]?.let {
                map[value]!! + 1
            } ?: 1
            max = if(map[value]!! > max) map[value]!! else max
        }

        var isFound: Boolean = false
        map.forEach { key, value ->
            if(value == max) {
                if(isFound) {
                    answer = -1
                    return@forEach
                } else {
                    isFound = true
                    answer = key
                }
            }
        }

        return answer
    }
}