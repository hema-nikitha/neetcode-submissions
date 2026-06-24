class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for(int k:mp.values()){
            if(k>1){
                return true;
            }
        }
        return false;
    }
}