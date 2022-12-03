fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    repeat(br.readLine().toInt()) {
        val returnValue: IntArray = isPalindrome(br.readLine())
        bw.write("${returnValue[0]} ${returnValue[1]}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

private fun isPalindrome(str: String): IntArray {
    return recursion(str, 0, str.lastIndex, 0)
}

private fun recursion(str: String, left: Int, right: Int, cnt: Int): IntArray {
    var newCnt: Int = cnt + 1
    return when {
        (left >= right) -> intArrayOf(1, newCnt)
        (str[left] != str[right]) -> intArrayOf(0, newCnt)
        else -> recursion(str, left + 1, right - 1, newCnt)
    }
}