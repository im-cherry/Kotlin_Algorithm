fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var input: List<String> = br.readLine().trim().split(" ")
    val N: Int = input[0].toInt()
    val M: Int = input[1].toInt()

    // N*M 행렬
    val A = Array(N) { Array<Int>(M) { 0 } }
    repeat(N) { n ->
        input = br.readLine().trim().split(" ")
        repeat(M) { m ->
            A[n][m] = input[m].toInt()
        }
    }

    val B = Array(N) { Array<Int>(M) { 0 } }
    repeat(N) { n ->
        input = br.readLine().trim().split(" ")
        repeat(M) { m ->
            B[n][m] = input[m].toInt()
        }
    }

    // A + B
    repeat(N) { n ->
        var str: String = ""
        repeat(M) { m ->
            str += "${A[n][m] + B[n][m]} "
        }
        bw.write("${str.trim()}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}