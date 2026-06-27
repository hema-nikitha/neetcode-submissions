class Solution {
    public int maxProfit(int[] prices) {
        // Profit=SP-CP.. 
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int p=prices[j]-prices[i];
                maxp=Math.max(maxp,p);
            }
        }
        return maxp;
        
    }
}
