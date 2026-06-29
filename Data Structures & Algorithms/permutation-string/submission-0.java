class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;

        }
        int [] sub=new int[26];
        int[] wind=new int[26];
        for(int i=0;i<s1.length();i++){
            sub[s1.charAt(i)-'a']++;
            wind[s2.charAt(i)-'a']++;
        }
        if(matches(sub,wind)){
            return true;
        }
        for(int j=s1.length();j<s2.length();j++){
            wind[s2.charAt(j)-'a']++;
            wind[s2.charAt(j-s1.length())-'a']--;
            if(matches(sub,wind)){
                return true;
            }
            

        }
        return false;
    }

        private boolean matches(int[] a,int [] b){
            for(int i=0;i<26;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
                return true;
            }
}
        
        
    

