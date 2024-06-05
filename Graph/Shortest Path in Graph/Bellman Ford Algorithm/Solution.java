class Solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int distance[] = new int [V];
        Arrays.fill(distance,(int)1e8);
        distance[S]=0;
        
        
        //Relax all the edges V-1 times
        for(int i=0;i<V-1;i++)
        {
            for(ArrayList<Integer>e:edges)
            {
                int u = e.get(0);
                int v = e.get(1);
                int w =e.get(2);
                if(distance[u]!=1e8 && distance[u]+w<distance[v])
                {
                    distance[v]=distance[u]+w;
                }
            }
        }
        
        //Do one more relaxation to detect the negative cycle
        for(ArrayList<Integer>e:edges)
        {
            int u = e.get(0);
            int v = e.get(1);
            int wt = e.get(2);
            if(distance[u]!=1e8&&distance[u]+wt<distance[v])
            {
                 return new int[]{-1};
            }
        }
        return distance;
        
        
    }
}
