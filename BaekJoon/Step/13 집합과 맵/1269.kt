fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val input: List<String> = br.readLine().split(" ")
    val a: Int = input[0].toInt()  // A 의 원소 개수
    val b: Int = input[1].toInt()  // B 의 원소 개수

    val map = HashMap<Int, Boolean>()
    br.readLine().split(" ").forEach {
        map.put(it.toInt(), true)
    }
    br.readLine().split(" ").forEach {
        val num: Int = it.toInt()
        if(map.containsKey(num)) {
            map.remove(num)
        } else {
            map.put(it.toInt(), true)
        }
    }
    bw.write("${map.size}")

    bw.flush()
    bw.close()
    br.close()
}