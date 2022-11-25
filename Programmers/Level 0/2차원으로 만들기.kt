class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        val size: Int = num_list.size
        val row: Int = size / n
        val col: Int = n

        var answer: Array<IntArray> = Array(row, { IntArray(col, { 0 }) })

        var index: Int = 0
        repeat(row) { r ->
            repeat(col) { c ->
                answer[r][c] = num_list[index++]
            }
        }

        return answer
    }
}