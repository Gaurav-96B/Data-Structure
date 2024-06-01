                                             DFS For Single Component
-----------------------------------------------------------------------------------------------------------------------   
class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        boolean visited[]=new boolean[V];
        dfs(adj,0,visited,ans);
        return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],ArrayList<Integer>ans)
    {
        visited[src]=true;
        ans.add(src);
        for(int adjacent:adj.get(src))
        {
            if(visited[adjacent]==false)
            {
                dfs(adj,adjacent,visited,ans);
            }
        }
        
    }
    
}
                                     DFS for Multiple Component
-----------------------------------------------------------------------------------------------------------------------------

class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfs(adj,i,visited,ans);
            }
        }
        return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],ArrayList<Integer>ans)
    {
        visited[src]=true;
        ans.add(src);
        for(int adjacent:adj.get(src))
        {
            if(visited[adjacent]==false)
            {
                dfs(adj,adjacent,visited,ans);
            }
        }
        
    }
}


