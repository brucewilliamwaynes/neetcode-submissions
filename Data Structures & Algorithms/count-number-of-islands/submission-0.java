class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rowLen = grid.length;
        int colLen = grid[0].length;
        for(int row = 0; row < rowLen; row++) {
            for(int col = 0; col < colLen; col++) {
                if(grid[row][col] == '1'){
                    count++;
                    markAsVistAllConnected(grid, row, col, rowLen, colLen);
                }
            }
        }
        return count;
    }
    private void markAsVistAllConnected(char[][] grid, int row, int col, int rowLen, int colLen) {
        if(row < 0 || row >= rowLen || col < 0 || col >= colLen) {
            return;
        }
        if(grid[row][col] == '1') {
            grid[row][col] = '0';
            markAsVistAllConnected(grid, row - 1, col, rowLen, colLen);
            markAsVistAllConnected(grid, row + 1, col, rowLen, colLen);
            markAsVistAllConnected(grid, row, col - 1, rowLen, colLen);
            markAsVistAllConnected(grid, row, col + 1, rowLen, colLen);
        }
    }
}
