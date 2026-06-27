class Solution {
    public int characterReplacement(String s, int k) {
        int f[]=new int[26];
        int l=0;
        int maxl=0;
        int maxfre=0;
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)-'A']++;
            maxfre=Math.max(maxfre,f[s.charAt(r)-'A']);
            while((r-l+1)-maxfre>k){
                f[s.charAt(l)-'A']--;
                l++;
            }

            maxl=Math.max(maxl,r-l+1);

        }
        return maxl;
        
    }
}
