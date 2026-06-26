class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean bs = true ;
        for(int i = 0 ; i<9 ; i++){
            Set<Character> st = new HashSet<Character>();
            for(int j=0 ; j<9 ; j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(st.contains(board[i][j])){
                    return false ;
                }else{
                    st.add(board[i][j]);
                }
            }
        }
        for(int j = 0 ; j<9 ; j++){
            Set<Character> st = new HashSet<Character>();
            for(int i=0 ; i<9 ; i++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(st.contains(board[i][j])){
                    return false ;
                } else{
                    st.add(board[i][j]);
                }
            }
        }
        for (int block = 0; block < 9; block++) {
            Set<Character> st = new HashSet<Character>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = 3 * (block / 3) + i;
                    int col = 3 * (block % 3) + j;
                    if (board[row][col] == '.') continue;
                    if (st.contains(board[row][col])) return false;
                    st.add(board[row][col]);
                }
            }
        }
        return true ;


        
    }
}
