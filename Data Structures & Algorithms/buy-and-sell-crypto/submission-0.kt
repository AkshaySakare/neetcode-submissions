class Solution {
    fun maxProfit(prices: IntArray): Int {
var maxprofit = 0
var bestBuy= prices[0]
for(i in 1 ..prices.size-1)
{
    if(prices[i]>bestBuy){
        maxprofit= max(maxprofit,prices[i]-bestBuy)

    }
    bestBuy = min(bestBuy,prices[i])


}
    return maxprofit}
}
