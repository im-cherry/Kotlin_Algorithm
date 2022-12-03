var arr: Array<CharArray> = arrayOf(charArrayOf())

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N: Int = br.readLine().toInt()

    arr = Array(N) { CharArray(N) }
    star(0, 0, N, false)

    for(r in 0 until N) {
        for( c in 0 until N) {
            bw.write("${arr[r][c]}")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

private fun star(r: Int, c: Int, N: Int, isBlank: Boolean) {
    if (isBlank) {
        for (i in r until r+N) {
            for (j in c until c+N) {
                arr[i][j] = ' '
            }
        }
        return
    }

    if (N == 1) {
        arr[r][c] = '*'
        return;
    }

    val size: Int = N / 3
    var cnt: Int = 0
    for (i in r until r+N step size) {
        for (j in c until c+N step size) {
            cnt++
            if (cnt == 5) {
                star(i, j, size, true)
            } else {
                star(i, j, size, false)
            }
        }
    }
}