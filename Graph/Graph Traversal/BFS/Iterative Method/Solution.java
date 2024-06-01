class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>queue=new LinkedList<>();
        boolean visited[]=new boolean[V];
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty())
        {
            int temp=queue.poll();
            ans.add(temp);
            for(int adjacent:adj.get(temp))
            {
                if(visited[adjacent]==false)
                {
                    queue.add(adjacent);
                    visited[adjacent]=true;
                }
                
            }
        }
        return ans;
    }
}
