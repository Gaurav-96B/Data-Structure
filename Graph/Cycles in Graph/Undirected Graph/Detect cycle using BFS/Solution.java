class Node
{
    int parent;
    int src;
    Node(int parent,int src)
    {
        this.parent=parent;
        this.src=src;
    }
}
class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[]=new boolean[V];
        Queue<Node>queue=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
            if(detectCycleUsingBfs(adj,i,queue,visited))
            return true;
            }
        }
        return false;
    }
    public boolean detectCycleUsingBfs(ArrayList<ArrayList<Integer>> adj,int src,Queue<Node>queue,boolean visited[])
    {
        queue.add(new Node(-1,src));
        visited[src]=true;
        while(!queue.isEmpty())
        {
        Node node=queue.poll();
        int parent=node.parent;
        int sr=node.src;
        for(int adjacent:adj.get(sr))
        {
           if(visited[adjacent]==false) 
           {
               visited[adjacent]=true;
               queue.add(new Node(sr,adjacent));
           }
           else if(parent!=adjacent)
           return true;
        }
       }
       return false;
    }
    
}
