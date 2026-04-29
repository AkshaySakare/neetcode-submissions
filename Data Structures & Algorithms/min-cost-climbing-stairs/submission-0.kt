class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
var size = cost.size
var arr = IntArray(size)
arr[0] = cost[0]
    arr[1] = cost[1]

var ans =0
for(i in 2..size-1){
arr[i] = 
    cost[i]+minOf(arr[i-1],arr[i-2])

}
  
  return minOf(arr[size-1],arr[size-2])  }
}
