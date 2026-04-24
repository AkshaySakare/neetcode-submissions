class Solution {
    fun evalRPN(tokens: Array<String>): Int {
val stack = ArrayDeque<Int>()

  for (token in tokens) {

        if (token == "+" || token == "-" || token == "*" || token == "/") {
   val b = stack.removeLast()
            val a = stack.removeLast()

            val result = when (token) {

                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> a / b
                else -> 0
            }
             stack.addLast(result)
    }else{
        stack.addLast(token.toInt())
    }

  }

   return stack.last()
}
}