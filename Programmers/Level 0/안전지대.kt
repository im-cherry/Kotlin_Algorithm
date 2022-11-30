class Solution {
    var R: Int = 0
    var C: Int = 0

    fun solution(board: Array<IntArray>): Int {
        R = board.size
        C = board[0].size

        var answer: Int = 0
        val map: Array<BooleanArray> = Array(R) { BooleanArray(C) { true } }  // 위험 지역 : false
        val position: Array<IntArray> = arrayOf(
            intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1),
            intArrayOf(1, 1), intArrayOf(1, -1), intArrayOf(-1, 1), intArrayOf(-1, -1),
            intArrayOf(0, 0)
        )

        board.forEachIndexed { row, line ->
            line.forEachIndexed { col, value ->
                if(value == 1) {
                    position.forEach { pos ->
                        val moveR: Int = pos[0]
                        val moveC: Int = pos[1]

                        if(isIn(row + moveR, col + moveC) && map[row + moveR][col + moveC]) {
                            map[row + moveR][col + moveC] = false
                            answer++
                        }
                    }
                }
            }
        }

        return R*C - answer
    }

    private fun isIn(r: Int, c: Int): Boolean {
        val result: Boolean = (r < 0) || (c < 0) || (r >= R) || (c >= C)
        return !result
    }
}