class Solution {
    fun solution(polynomial: String): String {
        if("+" !in polynomial) {
            return polynomial
        }

        var answer: String = ""

        var x: Int = 0
        var number: Int = 0
        polynomial.split("+").forEach {
            val str: String = it.trim()

            if("x" in str) {
                x += if(str.length == 1) 1 else str.substring(0, str.lastIndex).toInt()
            } else {
                number += str.toInt()
            }
        }

        answer = when(x) {
            0 -> ""
            1 -> "x"
            else -> "${x}x"
        }

        if(number != 0) {
            when(answer) {
                "" -> answer = "${number}"
                else -> answer += " + ${number}"
            }
        }

        return answer
    }
}