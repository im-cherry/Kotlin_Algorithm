fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val N: Int = br.readLine().toInt()  // 상근이가 가지고 있는 숫자 카드의 개수
    val cards = HashMap<Int, Boolean>()
    br.readLine().split(" ").forEach {
        cards.put(it.toInt(), true)
    }

    val M: Int = br.readLine().toInt()  // 상근이가 가지고 있는 숫자 카드인지 아닌지 구해야할 개수
    br.readLine().split(" ").forEach{
        if(cards.containsKey(it.toInt())) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}