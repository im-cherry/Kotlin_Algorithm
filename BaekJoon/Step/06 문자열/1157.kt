import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val word: String = br.readLine().uppercase(Locale.getDefault())

    // 알고리즘
    var max: Int = 1
    val dictionary = mutableMapOf<Char, Int>()
    word.forEach { ch ->
        dictionary[ch] = dictionary[ch]?.let {
            if (it + 1 > max) { max = it + 1 }
            it + 1
        } ?: 1
    }

    var answer: Char? = null
    dictionary.forEach { (key, value) ->
        if(value == max) {
            if (answer == null) { answer = key }
            else {
                answer = '?'
                return@forEach
            }
        }
    }

    // 출력
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}