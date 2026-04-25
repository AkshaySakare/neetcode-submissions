class Solution {
    fun search(nums: IntArray, target: Int): Int {
var end = nums.size-1
var start = 0
var ans =-1

while(start<=end){

    var mid = start +(end-start)/2
    if(target == nums[mid]){
        return mid
    }
    if(nums[start]<=nums[mid]){
       
    if(nums[start]<=target&&target<=nums[mid]){
    end = mid-1
    }else{
        start = mid+1
    }
}else{
 if(nums[mid]<=target&&target<=nums[end]){
    start = mid-1
    }else{
        end = mid+1
    }
}
    }
    return ans
}
}