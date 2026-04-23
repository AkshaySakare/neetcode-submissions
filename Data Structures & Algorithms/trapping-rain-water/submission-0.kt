class Solution {
    fun trap(height: IntArray): Int {
      val num = height.size
      var ans =0
var right = IntArray(num)
var left = IntArray(num)
var lHigh = height[0]
left[0] =  height[0]
for(i in 1.. num-1){
  left[i] = max(left[i-1],height[i])
}


right[num-1] =  height[num-1]
for(i in num-2 downTo 0){
  right[i] = max(right[i+1],height[i])
}

for (i in 0.. num-1) {
   
    ans +=   min(right[i], left[i]) - height[i]
}

return ans    }
}
