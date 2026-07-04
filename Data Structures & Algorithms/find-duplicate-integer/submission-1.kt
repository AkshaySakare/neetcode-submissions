class Solution {
    fun findDuplicate(nums: IntArray): Int {

         val map = HashSet<Int>()

        for (num in nums) {
            if (map.contains(num)) {
                return num
            }
            map.add(num)
        }
         return -1
    }
   
}
