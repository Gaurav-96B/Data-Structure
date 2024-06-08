//Number of island application
class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        
	       dfs(image,sr,sc,newColor,image[sr][sc]);
	       return image;
    }
    
    public void dfs(int image[][],int x,int y,int newcolor,int oldcolor)
        {
            if(x<0 || y<0 || x>=image.length || y>=image[0].length || image[x][y]==newcolor ||image[x][y]!=oldcolor)
            {
                return;
            }
            image[x][y]=newcolor;
            dfs(image,x-1,y,newcolor,oldcolor);
            dfs(image,x+1,y,newcolor,oldcolor);
            dfs(image,x,y-1,newcolor,oldcolor);
            dfs(image,x,y+1,newcolor,oldcolor);
        }
}
