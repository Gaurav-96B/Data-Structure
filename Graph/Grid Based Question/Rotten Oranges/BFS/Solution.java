class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int totalFresh=0;
        int totalRotten=0;
        int totalTime=0;
        int rotten=0;
        Queue<Pair>queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   totalFresh++; 
                }
                if(grid[i][j]==2){
                    totalRotten++;
                    queue.add(new Pair(i,j));
                }
            }
        }
        
        int totalFreshAndRottenOrange=totalRotten+totalFresh;
        if(totalFreshAndRottenOrange==0){
            return 0;
        }
        
        while(!queue.isEmpty()){
            int size=queue.size();
            rotten=rotten+size;
            if(rotten==totalFreshAndRottenOrange){
                return totalTime;
            }
            totalTime++;
            for(int i=0;i<size;i++){
            Pair p=queue.poll();
            if(p.x+1<grid.length&&grid[p.x+1][p.y]==1){
                grid[p.x+1][p.y]=2;
               queue.add(new Pair(p.x+1,p.y));
            }
            if(p.x-1>=0&&grid[p.x-1][p.y]==1){
                grid[p.x-1][p.y]=2;
               queue.add(new Pair(p.x-1,p.y));
            }
            if(p.y+1<grid[0].length&&grid[p.x][p.y+1]==1){
                grid[p.x][p.y+1]=2;
               queue.add(new Pair(p.x,p.y+1));
            }
            if(p.y-1>=0&&grid[p.x][p.y-1]==1){
                grid[p.x][p.y-1]=2;
               queue.add(new Pair(p.x,p.y-1));
            }
        }
            
     }
        return -1;
   }
}
