class Solution {
    // a > b > c
    // a < b + c
    fun solution(sides: IntArray): Int {
        var answer: Int = 0

        var a: Int = 0
        var b: Int = 0
        var c: Int = 0
        when {
            (sides[0] >= sides[1] && sides[1] >= sides[2]) -> {
                a = sides[0]
                b = sides[1]
                c = sides[2]
            }
            (sides[0] >= sides[2] && sides[2] >= sides[1]) -> {
                a = sides[0]
                b = sides[2]
                c = sides[1]
            }
            (sides[1] >= sides[0] && sides[0] >= sides[2]) -> {
                a = sides[1]
                b = sides[0]
                c = sides[2]
            }
            (sides[1] >= sides[2] && sides[2] >= sides[0]) -> {
                a = sides[1]
                b = sides[2]
                c = sides[0]
            }
            (sides[2] >= sides[0] && sides[0] >= sides[1]) -> {
                a = sides[2]
                b = sides[0]
                c = sides[1]
            }
            (sides[2] >= sides[1] && sides[1] >= sides[0]) -> {
                a = sides[2]
                b = sides[1]
                c = sides[0]
            }
        }
        answer = if(a < b + c) 1 else 2

        return answer
    }
}