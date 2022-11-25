class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = Integer.MAX_VALUE

        for(one in 0..hp/1) {
            for(three in 0..hp/3) {
                for(five in 0..hp/5) {
                    if(1*one + 3*three + 5*five == hp) {
                        if(one + three + five < answer) {
                            answer = one + three + five
                        }
                    }
                }
            }
        }

        return answer
    }
}