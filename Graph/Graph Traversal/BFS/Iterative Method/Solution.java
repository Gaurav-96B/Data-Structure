class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>queue=new LinkedList<>();
        boolean visited[]=new boolean[V];
        bfs(adj,0,queue,visited,ans);
        return ans;
        
    }
    public void bfs(ArrayList<ArrayList<Integer>> adj,int src,Queue<Integer>queue,boolean visited[],ArrayList<Integer>ans)
    {
        queue.add(src);
        visited[src]=true;
        while(!queue.isEmpty())
        {
            int data=queue.poll();
            ans.add(data);
            for(int adjacent:adj.get(data))
            {
              if(visited[adjacent]==false) 
              {
                  visited[adjacent]=true;
                  queue.add(adjacent);
              }
            }
        }
    }
    
}
