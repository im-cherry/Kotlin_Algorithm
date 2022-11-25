fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val S = br.readLine().toCharArray()

    // 알고리즘
    val answer: Array<Int> = Array(26) { -1 }
    S.forEachIndexed { index, ch ->
        if(answer[ch - 'a'] == -1) {
            answer[ch - 'a'] = index
        }
    }

    // 출력
    bw.write(answer.joinToString(" "))

    bw.flush()
    bw.close()
    br.close()
}