class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0

        LoopA@for(a in 0..3) {
            LoopB@for(b in 0..3) {
                if(a == b) continue@LoopB
                LoopC@for(c in 0..3) {
                    if(a == c || b == c) continue@LoopC
                    LoopD@for(d in 0..3) {
                        if(a == d || b == d || c == d) continue@LoopD
                        if(isParallel(dots[a], dots[b], dots[c], dots[d])) {
                            answer = 1
                            break@LoopA
                        }
                    }
                }
            }
        }

        return answer
    }

    private fun isParallel(dot1: IntArray, dot2: IntArray, dot3: IntArray, dot4: IntArray): Boolean {
        return (dot2[1] - dot1[1]) * (dot4[0] - dot3[0]) == (dot2[0] - dot1[0]) * (dot4[1] - dot3[1])
    }
}