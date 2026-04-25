class Solution {
    fun search(nums: IntArray, target: Int): Int {
var right = nums.size-1
var left =0
while(left<=right){
    var mid = left + (right - left)/2
    if(nums[mid] == target){
        return mid
    }
    if(nums[left]<=nums[mid]){//left
if(nums[mid]>target&&target>=nums[left]){
    right = mid-1 
}else{
   left= mid+1
}
    }else{

        if(nums[mid]<target&&target<=nums[right]){
    left = mid+1 
}else{
   right= mid-1
}
    }
}
return -1
    }
}
