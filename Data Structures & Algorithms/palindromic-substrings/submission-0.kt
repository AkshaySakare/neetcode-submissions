class Solution {
     var result =0
    fun countSubstrings(s: String): Int {
       
        var chArr = s.toCharArray()
for(i in  s.indices){
count(s,i,i)
count(s,i,i+1)
}
return result
    }

    fun count(s: String, start:Int, end:Int){
        var ss=start
        var ee = end
        while(ss >= 0 && ee < s.length){
            if (s[ss] != s[ee]) break
            result++
            ss--
            ee++
        }
    }
}
