class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 1

        val map: MutableMap<Char, Int> = mutableMapOf()
        before.forEach { ch ->
            map[ch] = map[ch]?.let {
                it + 1
            } ?: 1
        }

        after.forEach { ch ->
            if(map[ch] != null) {
                map[ch] = map[ch]!! - 1
                if(map[ch] == 0) {
                    map.remove(ch)
                }
            } else {
                answer = 0
                return@forEach
            }
        }

        return answer
    }
}