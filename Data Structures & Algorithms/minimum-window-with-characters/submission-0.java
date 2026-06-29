class Solution {
    public String minWindow(String s, String t) {
        //eg: t= aabc    s=abcdafgh
        if(t.length()>s.length()){
            return "";

        }
        // didn't mention lowercase so size 128
        // Mark the frequencies of every character
        int[] need=new int[128];     
        int[] wind= new int[128];
        for(char c:t.toCharArray()){
            need[c]++;  // a=2 , b=1, c=1
        }
        int have=0;
        int needct=t.length();  // needct=4
        int l=0;  // to shrink  the array
        int minlength=Integer.MAX_VALUE;  // to find the min window
        int st=0; // To expand the array
        // Traverse the S string 
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);    
            wind[ch]++;     // Extracted the count of each char in S str
            if(need[ch]>0 && wind[ch]<=need[ch]){
                have++;
            }
            while(have==needct){
                if(r-l+1<minlength){
                    minlength=r-l+1;
                    st=l;

                }
          
            char left=s.charAt(l);
            wind[left]--;
            if(need[left]>0 && wind[left]<need[left]){
                have--;
            }
            l++;

        }
    }
    if(minlength==Integer.MAX_VALUE){
        return "";
    }
    return s.substring(st,st+minlength);
}
}


        

