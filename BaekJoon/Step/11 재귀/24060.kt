var K: Int = 0
var cnt: Int = 0
var answer: Int = -1
var A: IntArray = intArrayOf()
var tmp: IntArray = intArrayOf()

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input: List<String> = br.readLine().split(" ")
    A = IntArray(input[0].toInt())
    tmp = IntArray(input[0].toInt())
    K = input[1].toInt()

    br.readLine().split(" ").forEachIndexed { index, value ->
        A[index] = value.toInt()
    }
    mergeSort(0, A.lastIndex)
    bw.write("$answer")

    bw.flush()
    bw.close()
    br.close()
}

private fun mergeSort(p: Int, r: Int) {
    if(p < r) {
        val q: Int = (p + r) / 2
        mergeSort(p, q)  // 전반부 정렬
        mergeSort(q + 1, r)  // 후반부 정렬
        if(merge(p, q, r)) return // 병합
    }
}

private fun merge(p: Int, q: Int, r: Int): Boolean {
    var i: Int = p
    var j: Int = q + 1
    var t: Int = 0
    while(i <= q && j <= r) {
        if(A[i] <= A[j]) {
            tmp[t++] = A[i++]
        } else {
            tmp[t++] = A[j++]
        }
    }
    while(i <= q) {
        tmp[t++] = A[i++]
    }
    while(j <= r) {
        tmp[t++] = A[j++]
    }
    i = p
    t = 0
    while(i <= r) {
        A[i++] = tmp[t++]
        cnt++
        if(cnt == K) {
            answer = A[i-1]
            return true
        }
    }
    return false
}