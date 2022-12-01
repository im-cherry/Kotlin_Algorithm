class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = IntArray(num, { 0 })

        var i: Int = 1000
        while(true) {
            val sum: Int = add(i, num)
            if(sum == total) {
                for(index in num-1 downTo 0) {
                    answer[index] = i
                    i--
                }
                break
            }
            i--
        }

        return answer
    }

    private fun add(end: Int, cnt: Int): Int {
        var sum: Int = 0
        for(i in end downTo end-cnt+1) {
            sum += i
        }
        return sum
    }
}