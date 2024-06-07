class Solution
{
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        /*Do the DFS and Sort all the edges according to finishing time*/
        boolean visited[]=new boolean[V];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                dfs(adj,i,visited,stack);
            }
        }
        
        /*Reverse the edges or graph and created new graph*/
        ArrayList<ArrayList<Integer>>reverseGraph=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
          reverseGraph.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++)
        {
          visited[i]=false;
          for(int adjacent:adj.get(i))
          {
             reverseGraph.get(adjacent).add(i);
          }
        }
        
        /*Pop the element from the stack and apply DFS on reverse graph and count scc*/
        int scc=0;
        while(!stack.isEmpty())
        {
          int node=stack.peek();
          stack.pop();
          if(visited[node]==false)
          {
              scc++;
              reverseDfs(reverseGraph,node,visited);
          }
        }
        return scc;
        
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int src,boolean visited[],Stack<Integer>stack)
    {
       visited[src]=true;
       for(int adjacent:adj.get(src))
       {
           if(visited[adjacent]==false)
           {
               dfs(adj,adjacent,visited,stack);
           }
       }
       stack.push(src);
    }
   public void reverseDfs(ArrayList<ArrayList<Integer>> reverseGraph,int src,boolean visited[])
    {
       visited[src]=true;
       for(int adjacent:reverseGraph.get(src))
       {
           if(visited[adjacent]==false)
           {
               reverseDfs(reverseGraph,adjacent,visited);
           }
       }
    }
    
    }
