fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var N: Int = br.readLine().toInt()

    var i: Int = 2
    while(N > 1) {
        if(N % i == 0) {
            N /= i
            bw.write("${i}\n")
            continue
        }
        i++
    }

    bw.flush()
    bw.close()
    br.close()
}