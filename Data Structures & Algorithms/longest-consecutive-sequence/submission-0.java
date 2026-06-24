class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int p:nums){
            set.add(p);
        }
        int longest=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int cur=n;
                int l=1;
            
            while(set.contains(cur+1)){
                cur++;
                l++;
            }
            longest=Math.max(longest,l);

        }
        
        
        
    }
    return longest;
}
}
