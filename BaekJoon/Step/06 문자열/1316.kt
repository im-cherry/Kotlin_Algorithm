fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var answer: Int = 0
    repeat(br.readLine().toInt()) {
        val map: MutableSet<Char> = mutableSetOf()

        val word = br.readLine().toCharArray()
        var previousWord: Char = word[0]
        var isGroupWord: Boolean = true

        for(i in 1 until word.size) {
            val currentWord = word[i]
            if(currentWord != previousWord) {
                if(map.add(previousWord)) {
                    previousWord = currentWord
                } else {
                    isGroupWord = false
                    break
                }
            }
        }
        if(!map.add(previousWord)) { isGroupWord = false }

        if(isGroupWord) {
            answer++
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}