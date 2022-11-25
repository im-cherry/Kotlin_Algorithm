import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    while(true) {
        val n: Int = br.readLine().toInt()
        if(n == 0) break

        var cnt: Int = 0  // 소수의 개수
        for(i in n+1..2*n) {
            if(isPrime(i)) {
                cnt++
            }
        }
        bw.write("${cnt}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

fun isPrime(num: Int): Boolean {
    if(num == 1) return false
    if(num == 2) return true
    if(num % 2 == 0) return false

    for(i in 3 .. sqrt(num.toDouble()).toInt() step 2) {
        if(num % i == 0) return false
    }

    return true
}