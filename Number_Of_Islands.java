class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int island = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    ++island;
                    dfs(i,j,grid);
                }
            }
        }
        
                for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
                System.out.println("");
                
                }
        
        return island;
    }
    
    public void dfs(int row, int col, char grid[][])
    {
        
        if(row<0 || col<0 || (row>=grid.length)||(col>=grid[0].length)||(grid[row][col]!='1') )
            return;
        
        grid[row][col] = '2';
        
        dfs(row-1,col,grid);
        dfs(row,col+1,grid);
        dfs(row+1,col,grid);
        dfs(row,col-1,grid);
        
    }
}
