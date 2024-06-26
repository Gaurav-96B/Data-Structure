//Number of Island Application
class Solution
{
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
       int count=0;
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
               if(grid[i][j]=='X')
               {
                   dfs(grid,i,j);
                   count++;
               }
           }
       }
       return count;
    }
    public void dfs(char grid[][],int i,int j)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='X')
        {
            return;
        }
        
        grid[i][j]='O';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
