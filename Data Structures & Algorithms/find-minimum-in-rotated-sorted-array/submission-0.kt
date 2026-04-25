class Solution {
    fun findMin(nums: IntArray): Int {
var end = nums.size-1
var start = 0

while(start<end){
var mid = (end+start)/2
if(nums[mid]>nums[end]){
    start = mid+1
}else{
    end=mid
}

}
    return nums[start]
    }
}
