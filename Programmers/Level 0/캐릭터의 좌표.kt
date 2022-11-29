class Solution {
    var X: Int = 0
    var Y: Int = 0

    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = IntArray(2)


        X = board[0]
        Y = board[1]
        val centerX: Int = board[0] / 2
        val centerY: Int = board[1] / 2
        var current: IntArray = intArrayOf(centerX, centerY)
        keyinput.forEach { move ->
            val currentX: Int = current[0]
            val currentY: Int = current[1]

            when(move) {
                "up" -> {
                    if(isIn(currentX, currentY + 1)) {
                        current[1]++
                    }
                }
                "down" -> {
                    if(isIn(currentX, currentY - 1)) {
                        current[1]--
                    }
                }
                "left" -> {
                    if(isIn(currentX - 1, currentY)) {
                        current[0]--
                    }
                }
                "right" -> {
                    if(isIn(currentX + 1, currentY)) {
                        current[0]++
                    }
                }
            }
        }

        answer[0] = current[0] - centerX
        answer[1] = current[1] - centerY
        return answer
    }

    private fun isIn(x: Int, y: Int): Boolean {
        val result: Boolean = (x < 0) || (y < 0) || (x >= X) || (y >= Y)
        return !result
    }
}