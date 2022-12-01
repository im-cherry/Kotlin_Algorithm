class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0

        val duplicatedLines: MutableSet<String> = mutableSetOf()

        for(i in 0..2) {
            val start1: Int = lines[i][0]
            val end1: Int = lines[i][1]
            for(j in i+1..2) {
                val start2: Int = lines[j][0]
                val end2: Int = lines[j][1]

                val start: Int = if(start1 > start2) start1 else start2
                val end: Int = if(end1 < end2) end1 else end2

                for(p in start until end) {
                    duplicatedLines.add("${p} ${p+1}")
                }
            }
        }

        answer = duplicatedLines.size

        return answer
    }
}