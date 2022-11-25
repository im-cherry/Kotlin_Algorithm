import java.lang.Integer.min

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 입력
    val M: Int = br.readLine().toInt()  // M이상
    val N: Int = br.readLine().toInt()  // N이하

    // 알고리즘
    var minValue: Int = Int.MAX_VALUE
    var sum: Int = 0
    Loop@for(i in M..N) {
        if(i == 1) continue
        if(i == 2) {
            minValue = 2
            sum += 2
            continue
        }

        if(i % 2 == 0) continue

        for(j in i-1 downTo 2) {
            if(i % j == 0) continue@Loop
        }
        sum += i
        minValue = min(minValue, i)
    }

    // 출력
    if(minValue == Int.MAX_VALUE) {
        bw.write("-1")
    } else {
        bw.write("${sum}\n${minValue}")
    }

    bw.flush()
    bw.close()
    br.close()
}