import java.util.*
import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val array = PriorityQueue<IntArray>(Comparator { o1, o2 ->
        if(o1[0] == o2[0]) {
            if(o1[1] >= o2[1]) 1
            else -1
        }
        else if(o1[0] > o2[0]) 1
        else -1
    })

    repeat(br.readLine().toInt()) {
        val x: Int = br.readLine().toInt()

        if(x == 0) {
            if(array.isEmpty()) {
                bw.write("0\n")
            } else {
                bw.write("${array.remove()[1]}\n")
            }
        } else {
            array.add(intArrayOf(abs(x), x))
        }
    }

    bw.flush()
    bw.close()
    br.close()
}