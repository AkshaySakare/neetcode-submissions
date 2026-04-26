class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
val set = HashSet<Char>()
    var left = 0
   
    var maxLength = 0
for(i in s.indices ){
   while (set.contains(s[i])) {
    set.remove(s[left])
    left++
}
    set.add(s[i])
   maxLength = max(maxLength,i - left + 1) 
}
  return maxLength  
  }
}
