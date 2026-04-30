class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row<9; row++) {
            Set<Character> set = new HashSet<>();
            for(int col=0; col<9; col++) {
                if (board[row][col] == '.') 
                    continue;
                char c = board[row][col];
                if(set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        for(int row=0; row<9; row++) {
            Set<Character> set = new HashSet<>();
            for(int col=0; col<9; col++) {
                if (board[col][row] == '.') 
                    continue;
                char c = board[col][row];
                if(set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        for(int square=0; square<9; square++) {
            Set<Character> set = new HashSet<>();
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square / 3) * 3 + j;
                    if (board[row][col] == '.') 
                        continue;
                    char c = board[row][col];
                    if(set.contains(c)) {
                        return false;
                    }
                    set.add(c);
                }
            }
        }
        return true;

    }
}
