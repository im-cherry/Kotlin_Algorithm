fun main() {
    // 입력
    val input: List<String> = readLine()!!.split(" ")

    // 알고리즘
    val dice1: Int = input[0].toInt()
    val dice2: Int = input[1].toInt()
    val dice3: Int = input[2].toInt()

    val answer = when {
        dice1 == dice2 -> {
            if(dice2 == dice3) 10000 + (dice1 * 1000)
            else 1000 + (dice1 * 100)
        }
        dice1 == dice3 -> {
            if(dice3 == dice2) 10000 + (dice1 * 1000)
            else 1000 + (dice1 * 100)
        }
        dice2 == dice3 -> {
            if(dice3 == dice1) 10000 + (dice1 * 1000)
            else 1000 + (dice2 * 100)
        }
        else -> {
            when {
                (dice1 > dice2 && dice1 > dice3) -> dice1 * 100
                (dice2 > dice1 && dice2 > dice3) -> dice2 * 100
                else -> dice3 * 100
            }
        }
    }

    // 출력
    println(answer)
}