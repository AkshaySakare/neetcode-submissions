class MinStack() {
private val stack = ArrayDeque<Int>()
    private val minStack = ArrayDeque<Int>()
    fun push( x : Int) {
stack.addLast(x)

        // If minStack empty OR x is smaller → push
        if (minStack.isEmpty() || x <= minStack.last()) {
            minStack.addLast(x)
        }
    }

    fun pop() {
 if (stack.isEmpty()) return
 if (minStack.isEmpty()) return
        val removed = stack.removeLast()

        // If removed is min → remove from minStack
        if (removed == minStack.last()) {
            minStack.removeLast()
        }
    }

    fun top(): Int {
 return stack.last()
    }

    fun getMin(): Int {
     
return minStack.last()
    }
}
