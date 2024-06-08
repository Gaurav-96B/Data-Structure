class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Solution{
    public int helpaterp(int [][]grid){
        int totalUninfected =0;
        int totalInfected =0;
        int totalTime=0;
        int infected=0;
        Queue<Pair>queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   totalUninfected++; 
                }
                if(grid[i][j]==2){
                    totalInfected++;
                    queue.add(new Pair(i,j));
                }
            }
        }
        
        int totalUninfectedAndInfectedPatient=totalUninfected+totalInfected;
        if(totalUninfectedAndInfectedPatient==0){
            return 0;
        }
        
        while(!queue.isEmpty()){
            int size=queue.size();
            infected=infected+size;
            if(infected==totalUninfectedAndInfectedPatient){
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
