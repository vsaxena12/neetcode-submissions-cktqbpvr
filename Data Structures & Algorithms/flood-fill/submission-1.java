class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(color != oldColor) {
            dfs(image, sr, sc, color, oldColor);
        }
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int oldColor) {
        if(image[r][c] == oldColor) {
            image[r][c] = color;
            if(r>0) {
                dfs(image, r-1, c, color, oldColor);
            }
            if(r+1<image.length) {
                dfs(image, r+1, c, color, oldColor);
            }
            if(c>0) {
                dfs(image, r, c-1, color, oldColor);
            }
            if(c+1<image[0].length) {
                dfs(image, r, c+1, color, oldColor);
            }
        }
    }
}