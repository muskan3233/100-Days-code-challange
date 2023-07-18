// Stock buy and sell II
class Solution {
   public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int res=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1])
            res+=prices[i]-prices[i-1];
        }
        return res;
    }
}
// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell2615/1
/
