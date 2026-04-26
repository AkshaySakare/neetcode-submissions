class Solution {
    fun letterCombinations(digits: String): List<String> {
 if (digits.isEmpty()) return emptyList()

        val map = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )

       
          val queue = ArrayDeque<String>()
    queue.add("")
    for(digit in digits){
        val size = queue.size
        val letters = map[digit]!!
   repeat(size) {
            val curr = queue.removeFirst()
            for (ch in letters) {
                queue.add(curr + ch)
            }
        }
    }
     return queue.toList()
    }
}
