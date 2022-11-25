fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    // 100 * 100 흰색 도화지
    val paper = Array(100) { Array<Boolean>(100) { false } }
    var area: Int = 0  // 색종이가 붙은 영역

    // 색종이 붙이기
    repeat(br.readLine().toInt()) {
        val input: List<String> = br.readLine().split(" ")
        val startX: Int = input[0].toInt()
        val startY: Int = input[1].toInt()

        repeat(10) { x ->
            repeat(10) { y ->
                if(!paper[startX + x][startY + y]) {
                    paper[startX + x][startY + y] = true
                    area++
                }
            }
        }
    }

    // 출력
    bw.write("$area")

    bw.flush()
    bw.close()
    br.close()
}