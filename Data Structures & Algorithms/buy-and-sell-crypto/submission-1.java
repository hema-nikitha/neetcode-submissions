class Solution {
    public int maxProfit(int[] prices) {
        // Profit=SP-CP.. 
        int maxp=0;
        int n=prices.length;
        
        int minp=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }
            else{
                int p=prices[i]-minp;
                maxp=Math.max(p,maxp);

            }
        }
        return maxp;
    }
}