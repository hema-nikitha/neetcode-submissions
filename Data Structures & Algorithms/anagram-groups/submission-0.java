class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String K=new String(arr);
            if(!mp.containsKey(K)){
                mp.put(K,new ArrayList<>());
            }
            mp.get(K).add(s);
        }
        return new ArrayList<>(mp.values());

        
    }
}
