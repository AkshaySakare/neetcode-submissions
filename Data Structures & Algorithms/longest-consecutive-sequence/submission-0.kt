class Solution {
    fun longestConsecutive(nums: IntArray): Int {
if (nums.isEmpty()) return 0

    nums.sort()

    var longest = 1
    var current = 1

    for (i in 1 until nums.size) {
        if (nums[i] == nums[i - 1]) {
            continue // duplicate skip
        } else if (nums[i] == nums[i - 1] + 1) {
            current++
        } else {
            longest = maxOf(longest, current)
            current = 1
        }
    }

    return maxOf(longest, current)
    }
}
