class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
val n =nums.size
val result = IntArray(n)
var left = 1
for (i in 0 until n) {
result[i]=left
left = left*nums[i]
 }

    var right = 1
    for(i in n-1 downTo 0){
      result[i]=result[i]*right
right = right* nums[i]
    }

return result
}
}