class NumMatrix {

    private int[][] prefixMatrix;

    public NumMatrix(int[][] matrix) {
        //this.matrix = matrix;
        int y = matrix.length;
        int x = matrix[0].length;

        prefixMatrix = new int[y+1][x+1];

        for(int i=1; i<y; i++) {
            
            prefixMatrix[i][1] = matrix[i][1];

            for(int j=1; j<x; j++) {
                prefixMatrix[i][j] = prefixMatrix[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i<=row2; i++) {
            sum = sum + (prefixMatrix[i][col2] - prefixMatrix[i][col1-1]); 
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */