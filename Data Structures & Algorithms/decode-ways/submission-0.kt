class Solution {
    fun numDecodings(s: String): Int {
        var n = s.length
        var dplist = IntArray(n+1 )
        dplist[0]=1
       if (s[0] == '0'){
            dplist[1]=0
        }else{
            dplist[1]=1
        }
        for(i in 2.. n){
            var onedigit = s.substring(i-1,i).toInt()
             var twodigit = s.substring(i-2,i).toInt()
             if(onedigit in 1..9){
                dplist[i]+=dplist[i-1]
             }
             if(twodigit in 10..26){
                dplist[i]+=dplist[i-2]
             }
        }
return dplist[n]
    }
}
