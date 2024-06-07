class Node
{
    int u;
    int v;
    int w;
    Node(int u,int v,int w)
    {
        this.u=u;
        this.v=v;
        this.w=w;
    }
}

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> g) {
    Collections.sort(g,(a,b) -> {return a.w-b.w;});
    for(int i=0;i<E;i++)
        {
            Node n=g[i];
            int p1=findPar(parent, n[0]);
            int p2=findPar(parent, n[1]);
            if(p1!=p2)
            {
                costMST=costMST+n.w;
                union(parent, rank, n[0], n[1]);
            }
        }
        return costMST;

}

 public static int findPar(int[] parent, int x)
    {
        if(parent[x]==x)
            return x;
        return parent[x]=findPar(parent, parent[x]);
    }
    public static void union(int[] parent, int[] rank, int u, int v)
    {
        u=findPar(parent, u);
        v=findPar(parent, v);
        if(rank[u]<rank[v])
        {
            parent[u]=v;
        }
        else if(rank[v]<rank[u])
        {
            parent[v]=u;
        }
        else
        {
            parent[v]=u;
            rank[u]++;
        }
    }
}
