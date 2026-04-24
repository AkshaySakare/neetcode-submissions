class Solution {
    fun isValid(s: String): Boolean {
var stack = ArrayDeque<Char>()
var isvalid:Boolean
for(i in 0 until s.length){

val ch = s[i]
if(ch=='['||ch == '{'|| ch == '('){
    stack.add(ch)
}
    else if (ch == ')' || ch == '}' || ch == ']') {

            // If stack is empty → invalid
            if (stack.isEmpty()) {
                return false
            }
            var top = stack.removeLast()
            if(top=='('&& ch !=')' ){
                return false
            }
            if(top == '{'&&ch!='}'){
            return false}
            if(top == '['&& ch!=']'){
            return false
            }


     }
    }
      return    stack.isEmpty()
    }

}
