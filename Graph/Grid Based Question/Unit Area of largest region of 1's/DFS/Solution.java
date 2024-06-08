//Number of island application
class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
   {
       int ans=0;
       for(int i=0;i<grid.length;i++) {
           for(int j=0;j<grid[0].length;j++) {
               if(grid[i][j] == 1) {
                   int num = dfs(grid,i,j);
                   ans=Math.max(ans,num);
               }
           }
       }
       return ans;
   }
   public int dfs(int[][]grid,int i,int j) {
       
       if(i < 0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 ) 
           return 0;
       
       int sum=0;
       grid[i][j] = 0;
       sum += dfs(grid,i+1,j);
       sum += dfs(grid,i,j+1);
       sum += dfs(grid,i,j-1);
       sum += dfs(grid,i-1,j);
       
       sum += dfs(grid,i+1,j+1);
       sum += dfs(grid,i-1,j-1);
       sum += dfs(grid,i+1,j-1);
       sum += dfs(grid,i-1,j+1);
       //Current cell is part of the region that's why added 1 into sum.
       return sum + 1;
   }
}
