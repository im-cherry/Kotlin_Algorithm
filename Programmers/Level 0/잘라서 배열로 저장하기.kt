class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val len: Int = if(my_str.length % n == 0) my_str.length / n else (my_str.length / n) + 1
        var answer: Array<String> = Array<String>(len) { "" }

        var i: Int = 0
        var str: String = ""
        my_str.forEachIndexed { index, value ->
            str += value
            if((index + 1) % n == 0) {
                answer[i++] = str
                str = ""
            }
        }
        if(str != "") {
            answer[i] = str
        }

        return answer
    }
}