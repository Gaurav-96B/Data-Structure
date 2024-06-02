class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
    {
       ArrayList<Integer>ans=new ArrayList<>();
       
      //Find the indegree of all vertex
        int indegree[] = new int[V]; 
        for(int i = 0;i<V;i++) {
            for(int adjacent: adj.get(i)) {
                indegree[adjacent]++; 
            }
        }
        
      //Push zero indegree vertex into queue
       Queue<Integer> q = new LinkedList<Integer>(); 
        for(int i = 0;i<V;i++) {
            if(indegree[i] == 0) {
                q.add(i); 
            }
        }
        
      //Pop the element from queue while queue is not empty
       while(!q.isEmpty()) {
            int node=q.poll(); 
            ans.add(node);
            for(int adjacent:adj.get(node)) {
                indegree[adjacent]--; 
                if(indegree[adjacent] == 0) {
                    q.add(adjacent); 
                }
            }
        }
        //DAG(Directed Acyclic Graph)=> ans.size()==V
       //DCG(Directed Cyclic Graph)=> ans.size()!=V
        return ans.size()!=V;
    }
    
}
