import kotlin.math.*

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var answer: IntArray = IntArray(numlist.size, { 0 })

        val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()  // distance: num
        numlist.sorted().reversed().forEachIndexed { index, num ->
            val dist: Int = abs(n - num)

            if(map[dist] == null) {
                map[dist] = mutableListOf(num)
            } else {
                map[dist]!!.add(num)
            }
        }

        var index: Int = 0
        map.keys.sorted().forEach { key ->
            map[key]?.forEach { value ->
                answer[index] = value
                index++
            }
        }

        return answer
    }
}