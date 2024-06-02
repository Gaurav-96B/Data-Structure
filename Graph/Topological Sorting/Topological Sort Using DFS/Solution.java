class Solution
{
    static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) 
    {
      boolean visited[]=new boolean[N];
      Stack<Integer>stack=new Stack<>();
      for(int i=0;i<N;i++)
      {
          if(visited[i]==false)
          {
              topologicalSortUsingDfs(adj,i,visited,stack);
          }
      }
      
      int ans[]=new int[N];
      int k=0;
      while(!stack.isEmpty())
      {
         ans[k++]=stack.pop();
      }
      return ans;
        
    }
  
    static void topologicalSortUsingDfs(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],Stack<Integer>stack)
    {
        visited[src]=true;
        for(int adjacent:adj.get(src))
        {
            if(visited[adjacent]==false)
            {
               topologicalSortUsingDfs(adj,adjacent,visited,stack);
            }
        }
        stack.push(src);
    }
    
}
