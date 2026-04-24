class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

var left = numbers.size-1
var right =0
while(right<=left)
{ var sum = numbers[right]+numbers[left]
if(sum<target)
{
    right++


}else if(sum>target){
    left--
}
else{
    return intArrayOf(right+1,left+1)
}
}
   return intArrayOf()
     }
}
