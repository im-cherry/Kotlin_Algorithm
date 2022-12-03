fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input: List<String> = br.readLine().split(" ")
    val N: Int = input[0].toInt()  // 포켓몬의 개수
    val M: Int = input[1].toInt()  // 맞춰야하는 문제의 개수

    // 포켓몬 도감 생성하기
    val dictionary1 = HashMap<String, Int>()  // 포켓몬이름 : 번호
    val dictionary2 = HashMap<Int, String>()  // 번호 : 포켓몬 이름
    for(index in 1..N) {
        val pokemon: String = br.readLine()
        dictionary1.put(pokemon, index)
        dictionary2.put(index, pokemon)
    }

    // 문제 맞추기
    repeat(M) {
        val value: String = br.readLine()

        if(value.toIntOrNull() == null) {
            bw.write("${dictionary1.get(value)}\n")
        } else {
            bw.write("${dictionary2.get(value.toInt())}\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}