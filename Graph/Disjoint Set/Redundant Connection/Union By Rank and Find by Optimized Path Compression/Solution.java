class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        if (edges.length == 0){
            return null;
        }
        int parent[] = new int[edges.length+1];
        int rank[]=new int[edges.length+1];
        for (int i=0;i<=edges.length; i++)
        {
            parent[i]=i;
            rank[i]=0; 
        }
        for (int []edge:edges) {
            int u=find(parent, edge[0]);
            int v=find(parent, edge[1]);
            if (u == v)
                return new int[]{edge[0], edge[1]};
            else
                unionByRank(parent, u, v,rank);
        }
        return null;
    }
    public int find(int [] parent, int v) {
        if (parent[v]==v)
        {
            return v;
        }
        return parent[v]=find(parent, parent[v]);
    }
    public void unionByRank(int [] parent, int u, int v,int rank[]) {
        int uSet = find(parent, u);
        int vSet = find(parent, v);
        if(rank[uSet]<rank[vSet])
        {
            parent[uSet]=vSet;
        }
        else if(rank[vSet]<rank[uSet])
        {
            parent[uSet]=vSet;
        }
        else
        {
        parent[uSet] = vSet;
        rank[vSet]++;
        }
    } 
}
