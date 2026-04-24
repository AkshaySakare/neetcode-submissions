class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
val stack = ArrayDeque<Int>()
    val n = temperatures.size
    val result = IntArray(n)
for(i in 0 until n){
while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.last()])
{
   
    val prevIndex = stack.removeLast()
            result[prevIndex] = i - prevIndex
}
stack.addLast(i)
}

return result
    }
}
