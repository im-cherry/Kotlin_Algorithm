class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0

        var preNum: String = ""
        my_string.forEach { ch ->
            var num: String = ch.toString()
            if(num in "0123456789") {
                preNum += num
            } else {
                if(preNum != "") {
                    answer += preNum.toInt()
                    preNum = ""
                }
            }
        }
        if(preNum != "") {
            answer += preNum.toInt()
        }

        return answer
    }
}