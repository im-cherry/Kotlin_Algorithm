class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0

        if(a > b) {
            var num1: Int = a
            var num2: Int = b
            for(i in 2..b) {
                if(num1 % i == 0 && num2 % i == 0) {
                    num1 /= i
                    num2 /= i
                }
            }

            while(true) {
                if(num2 % 2 != 0) break
                num2 /= 2
            }

            while(true) {
                if(num2 % 5 != 0) break
                num2 /= 5
            }

            answer = if(num2 == 1) 1 else 2
        } else {
            var num1: Int = b
            var num2: Int = a
            for(i in 2..a) {
                if(num1 % i == 0 && num2 % i == 0) {
                    num1 /= i
                    num2 /= i
                }
            }

            while(true) {
                if(num1 % 2 != 0) break
                num1 /= 2
            }

            while(true) {
                if(num1 % 5 != 0) break
                num1 /= 5
            }

            answer = if(num1 == 1) 1 else 2
        }

        return answer
    }
}