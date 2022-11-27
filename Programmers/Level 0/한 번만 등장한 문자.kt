class Solution {
    fun solution(s: String): String {
        var answer: String = ""

        val map: MutableMap<String, Int> = mutableMapOf()
        s.forEach { ch ->
            val alphabet: String = ch.toString()
            map[alphabet] = map[alphabet]?.let {
                it + 1
            } ?: 1
        }

        map.toSortedMap().forEach { key, value ->
            if(value == 1) {
                answer += key
            }
        }

        return answer
    }
}