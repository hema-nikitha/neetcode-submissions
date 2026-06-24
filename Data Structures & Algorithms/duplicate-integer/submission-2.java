class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int p:nums){
            if(set.contains(p)){
                return true;
            }
            set.add(p);
        }
        return false;
    
    }
}