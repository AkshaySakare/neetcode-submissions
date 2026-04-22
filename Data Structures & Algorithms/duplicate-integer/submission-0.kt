class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
  val seen = HashSet<Int>()
    val duplicates = HashSet<Int>()
   for(num in nums){
    if(!seen.add(num)){
          duplicates.add(num)
    }
   }

   if(duplicates.size>0){
    return true
   }else{
    return false
   }

    }
}
