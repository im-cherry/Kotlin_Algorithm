class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        val side: MutableSet<Int> = mutableSetOf()

        var max: Int = 0
        var min: Int = 0
        if(sides[0] > sides[1]) {
            max = sides[0]
            min = sides[1]
        } else {
            max = sides[1]
            min = sides[0]
        }

        // a > b > c
        // a = ?
        var a: Int = max
        var b: Int = max
        var c: Int = min
        while(a < b + c) {
            side.add(a)
            answer++
            a++
        }

        // b = ?
        a = max
        b = max
        c = min
        while(a < b + c && b >= min) {
            side.add(b)
            answer++
            b--
        }

        // c = ?
        a = max
        b = min
        c = min
        while(a < b + c && c > 0) {
            side.add(c)
            answer++
            c--
        }

        answer = side.size

        return answer
    }
}