class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0

        var minX: Int = 256
        var maxX: Int = -256
        var minY: Int = 256
        var maxY: Int = -256

        dots.forEach { (x, y) ->
            minX = if(x < minX) x else minX
            maxX = if(x > maxX) x else maxX
            minY = if(y < minY) y else minY
            maxY = if(y > maxY) y else maxY
        }

        answer = (maxX - minX) * (maxY - minY)

        return answer
    }
}