class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
            if(detectCycleUsingDfs(adj,i,-1,visited))
            return true;
            }
        }
        return false;
    }
    public boolean detectCycleUsingDfs(ArrayList<ArrayList<Integer>> adj,int src,int parent,boolean visited[])
    {
        visited[src]=true;
        for(int adjacent:adj.get(src))
        {
            if(visited[adjacent]==false)
            {
                if(detectCycleUsingDfs(adj,adjacent,src,visited))
                return true;
            }
            else if(adjacent!=parent)
            return true;
        }
        return false;
    }
