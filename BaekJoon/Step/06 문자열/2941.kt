fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val word: String = br.readLine()
    var answer: Int = word.length

    word.forEachIndexed { i, ch ->
        when (ch) {
            '=' -> {
                if (word[i - 1] == 'c' || word[i - 1] == 's') {
                    answer--
                }
                if (word[i - 1] == 'z') {
                    answer--
                    if (i - 2 >= 0 && word[i - 2] == 'd') {
                        answer--
                    }
                }
            }
            '-' -> {
                if(word[i - 1] == 'c' || word[i - 1] == 'd') {
                    answer--
                }
            }
            'j' -> {
                if(i - 1 >= 0 && (word[i - 1] == 'l' || word[i - 1] == 'n')) {
                    answer--
                }
            }
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}