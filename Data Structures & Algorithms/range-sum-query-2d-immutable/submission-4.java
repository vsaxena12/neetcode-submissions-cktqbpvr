class NumMatrix {

    private int[][] prefixMatrix;

    public NumMatrix(int[][] matrix) {
        //this.matrix = matrix;
        int y = matrix.length;
        int x = matrix[0].length;

        prefixMatrix = new int[y][x];

        for(int i=0; i<y; i++) {
            
            prefixMatrix[i][0] = matrix[i][0];

            for(int j=1; j<x; j++) {
                prefixMatrix[i][j] = prefixMatrix[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i<=row2; i++) {
            sum = sum + (prefixMatrix[i][col2] - (col1 > 0 ? prefixMatrix[i][col1-1] : 0)); 
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */