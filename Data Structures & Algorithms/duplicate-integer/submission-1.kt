class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
  val seen = HashSet<Int>()
    val duplicates = HashSet<Int>()
    var isDuplicate:Boolean = false
   for(num in nums){
    if(!seen.add(num)){
      isDuplicate= true
         // duplicates.add(num)
    }
   }
   return isDuplicate

 }

    }

