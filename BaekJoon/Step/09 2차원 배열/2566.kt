fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 9*9 행렬
    var max: Int = -1  // 최대값
    var row: Int = 0  // 최대값이 위치해 있는 행
    var col: Int = 0  // 최대값이 위치해 있는 열

    // 최대값 찾기
    repeat(9) { r ->
        val input: List<String> = br.readLine().split(" ")
        repeat(9) { c ->
            val num:Int = input[c].toInt()

            if(num > max) {
                max = num
                row = r + 1
                col = c + 1
            }
        }
    }
    bw.write("${max}\n${row} ${col}")

    bw.flush()
    bw.close()
    br.close()
}