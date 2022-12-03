fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input: List<String> = br.readLine().split(" ")
    val N: Int = input[0].toInt()  // 집합 S에 있는 문자열의 개수
    val M: Int = input[1].toInt()  // 집합 S와 비교할 문자열의 개수

    val S = HashMap<String, Boolean>()
    repeat(N) {
        S.put(br.readLine(), true)
    }

    var cnt: Int = 0  // 개수
    repeat(M) {
        if(S.containsKey(br.readLine())) {
            cnt++
        }
    }
    bw.write("$cnt")

    bw.flush()
    bw.close()
    br.close()
}