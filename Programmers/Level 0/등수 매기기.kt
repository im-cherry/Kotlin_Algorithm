class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        var answer: IntArray = IntArray(score.size, { 0 })

        var avgMap: MutableMap<Double, MutableList<Int>> = mutableMapOf()
        score.forEachIndexed { index, (eng, math) ->
            val avg: Double = (eng + math) / 2.0
            if(avgMap[avg] == null) {
                avgMap[avg] = mutableListOf(index)
            } else {
                avgMap[avg]!!.add(index)
            }
        }

        var rank: Int = 1
        avgMap.keys.sorted().reversed().forEach { key ->
            avgMap[key]!!.forEach { index ->
                answer[index] = rank
            }
            rank += avgMap[key]!!.size
        }

        return answer
    }
}