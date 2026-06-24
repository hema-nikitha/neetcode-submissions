class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        } 
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char d:t.toCharArray() ){
            if(!mp.containsKey(d) || mp.get(d) == 0){
                return false;
            }

            mp.put(d,mp.get(d)-1);
            }
            return true;
        }
        
        
}


