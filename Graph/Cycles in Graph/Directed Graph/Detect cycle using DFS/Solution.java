class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
    {
      boolean visited[]=new boolean[V];
      boolean path[]=new boolean[V];
      for(int i=0;i<V;i++)
      {
          if(visited[i]==false)
          {
              if(detectCycleUsingDfs(adj,i,visited,path))
              return true;
          }
      }
      return false;
    }
    
    public boolean detectCycleUsingDfs(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],boolean path[])
    {
        visited[src]=true;
        path[src]=true;
        for(Integer adjacent:adj.get(src))
        {
            if(visited[adjacent]==false)
            {
               if(detectCycleUsingDfs(adj,adjacent,visited,path))
               return true;
            }
            else if(path[adjacent]==true)
            {
                return true;
            }
        }
        path[src]=false;
        return false;
    }
    
}
