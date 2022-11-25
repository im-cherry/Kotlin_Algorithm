class Solution {
    fun solution(numbers: IntArray): Int {
        if(numbers.size == 2) {
            return numbers[0] * numbers[1]
        }

        var answer: Int = 0

        val pList: MutableList<Int> = mutableListOf()
        val mList: MutableList<Int> = mutableListOf()
        numbers.forEach { num ->
            when {
                (num > 0) -> pList.add(num)
                (num < 0) -> mList.add(num)
            }
        }
        pList.sort()
        mList.sort()

        val pSize: Int = pList.size
        val mSize: Int = mList.size


        val pMax: Int = if(pSize >= 2) pList[pSize-1] * pList[pSize-2] else 0
        val mMax: Int = if(mSize >= 2) mList[0] * mList[1] else 0

        answer = if(pMax > mMax) pMax else mMax

        return answer
    }
}