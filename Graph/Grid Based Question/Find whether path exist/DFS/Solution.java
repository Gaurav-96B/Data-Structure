class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
              if(grid[i][j]==1){
              return dfs(grid,i,j);
           }
       }
       }
       return false;
    }
    public boolean dfs(int grid[][],int i,int j){
     if(i<0 || j<0 ||i>=grid.length || j>=grid[0].length || grid[i][j]==0){
     return false;
     }
     
     if(grid[i][j]==2){
     return true;
     }
     
     grid[i][j]=0;
     
     boolean d1=dfs(grid,i+1,j);
     boolean d2=dfs(grid,i,j+1);
     boolean d3=dfs(grid,i,j-1);
     boolean d4=dfs(grid,i-1,j);
     
     return d1||d2||d3||d4;
     
    }
    
}
