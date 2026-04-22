class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
val ans = HashMap<Int,Int>()

for(i in nums.indices)
{
 val complement = target - nums[i]
if (ans.containsKey(complement)) {
            return intArrayOf(ans[complement]!!, i)
        }
        ans[nums[i]] = i

}

    return intArrayOf()
    }
}
