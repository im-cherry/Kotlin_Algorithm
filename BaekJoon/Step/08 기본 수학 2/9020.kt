fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val list: List<Int> = createPrimeNumberList()

    repeat(br.readLine().toInt()) {
        val n: Int = br.readLine().toInt()

        var num1: Int = 0
        var num2: Int = 10000
        Loop@for(i in 0 until list.size) {
            if(list[i] > n) break@Loop

            for(j in i until list.size) {
                if(list[i] + list[j] == n) {
                    if((list[j] - list[i]) < (num2 - num1)) {
                        num1 = list[i]
                        num2 = list[j]
                    }
                }
            }
        }
        bw.write("${num1} ${num2}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}

fun createPrimeNumberList(): List<Int> {
    val list: MutableList<Int> = mutableListOf<Int>(2)

    Loop@for (i in 3..10000 step 2) {
        for(j in 3 until i step 2) {
            if(i % j == 0) continue@Loop
        }
        list.add(i)
    }

    return list
}