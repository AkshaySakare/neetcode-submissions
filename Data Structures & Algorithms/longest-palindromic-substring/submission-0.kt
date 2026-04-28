class Solution {
    fun iexpend(s: String, start: Int, end: Int): Int {
        var i = start
        var j = end

        while (i >= 0 && j < s.length ) {
            if( s[i] != s[j]) break
            i--
            j++
        }

        return j - i-1
    }


    
    fun longestPalindrome(s: String): String {
var start =0 
var end = 0
var size = s.length
for(i in s.indices){
    var len1= iexpend(s,i,i)
    var len2 =iexpend(s,i,i+1)
    var len = max(len1,len2)
    if(end-start<len){
        start = i-(len-1)/2
        end = i+(len)/2
    }
}
   return s.substring(start,end+1)
} 
   
}
