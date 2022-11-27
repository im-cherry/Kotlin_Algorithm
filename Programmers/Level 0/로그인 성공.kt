class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = "fail"

        val user_id = id_pw[0]
        val user_pw = id_pw[1]
        db.forEach Loop@{
            val db_id = it[0]
            val db_pw = it[1]

            if(user_id == db_id) {
                answer = if(user_pw == db_pw) "login" else "wrong pw"
                return@Loop
            }
        }

        return answer
    }
}