fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val map: HashMap<Char, Int> = hashMapOf(
        'A' to 3, 'B' to 3, 'C' to 3,
        'D' to 4, 'E' to 4, 'F' to 4,
        'G' to 5, 'H' to 5, 'I' to 5,
        'J' to 6, 'K' to 6, 'L' to 6,
        'M' to 7, 'N' to 7, 'O' to 7,
        'P' to 8, 'Q' to 8, 'R' to 8, 'S' to 8,
        'T' to 9, 'U' to 9, 'V' to 9,
        'W' to 10, 'X' to 10, 'Y' to 10, 'Z' to 10,
    )

    var answer: Int = 0
    val word = br.readLine().trim().toCharArray()
    word.forEach { ch ->
        answer += map[ch]!!
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}