import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val array = PriorityQueue<Int>()
    repeat(br.readLine().toInt()) {
        val x: Int = br.readLine().toInt()

        if(x == 0) {
            if(array.isEmpty()) {
                bw.write("0\n")
            } else {
                bw.write("${array.remove()}\n")
            }
        } else {
            array.add(x)
        }
    }

    bw.flush()
    bw.close()
    br.close()
}