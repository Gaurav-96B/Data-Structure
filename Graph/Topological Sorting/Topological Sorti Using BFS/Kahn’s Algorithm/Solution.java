class Solution
{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int ans[] = new int[V];
       
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
       int index=0;
       while(!q.isEmpty()) {
            int node=q.poll(); 
            ans[index++]=node;
            for(int adjacent:adj.get(node)) {
                indegree[adjacent]--; 
                if(indegree[adjacent] == 0) {
                    q.add(adjacent); 
                }
            }
        }
        return ans;
    }
    
}
