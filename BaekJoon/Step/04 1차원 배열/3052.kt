fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val count: MutableSet<Int> = mutableSetOf<Int>()
    repeat(10) {
        val num: Int = br.readLine().toInt()
        count.add(num % 42)
    }
    bw.write("${count.size}\n")

    bw.flush()
    bw.close()
    br.close()
}