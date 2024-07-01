class Node
{
    int u;
    int w;
    Node(int u,int w){
        this.u=u;
        this.w=w;
    }
}

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        boolean visited[]=new boolean[V];
        int distance[]=new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[S]=0;
        PriorityQueue<Node>pq=new PriorityQueue<>(((a,b)-> a.w-b.w));
        pq.add(new Node(S,0));
        while(!pq.isEmpty()){
            Node node=pq.poll();
            int u=node.u;
            int Uw=node.w;
            visited[u]=true;
            for(ArrayList<Integer>adjacent:adj.get(u)) {
                int v=adjacent.get(0);
                int Vw=adjacent.get(1);
                if(visited[v]==false && distance[v]>Uw+Vw){
                    distance[v]=Uw+Vw;
                    pq.add(new Node(v,distance[v]));
                }
            }
        }
        return distance;
    }
}
