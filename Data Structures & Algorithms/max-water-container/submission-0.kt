class Solution {
    fun maxArea(heights: IntArray): Int {
var maxwater =0
var lp = 0
var rp = heights.size-1
while(lp<rp){
var hh = min(heights[lp],heights[rp])
var ww = rp-lp
var currentwater = hh*ww
maxwater = max(currentwater,maxwater)

if(heights[lp]<heights[rp]){
    lp++
}else{
    rp--
}


}
return maxwater
    }
}
