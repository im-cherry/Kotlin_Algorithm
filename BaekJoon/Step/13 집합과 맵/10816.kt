fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val cards = HashMap<Int, Int>()  // 숫자 카드에 적혀있는 수 : 카드 개수

    val N: Int = br.readLine().toInt()
    br.readLine().split(" ").forEach {
        val num: Int = it.toInt()
        if(cards.containsKey(num)) {
            cards.replace(num, cards.get(num)!! + 1)
        } else {
            cards.put(num, 1)
        }
    }

    val M: Int = br.readLine().toInt()
    br.readLine().split(" ").forEach {
        val num: Int = it.toInt()

        if(cards.containsKey(num)) {
            bw.write("${cards.get(num)} ")
        } else {
            bw.write("0 ")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}