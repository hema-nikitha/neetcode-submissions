class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> sd=new HashSet<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char num=board[r][c];
                if(num=='.'){
                    continue;
                }
                if(!sd.add(num+"in row"+r)||!sd.add(num+"in col"+c)||!sd.add(num+"in box"+r/3+"-"+c/3)){
                    return false;
                }
            }
        }
        return true;
        
    }
}
