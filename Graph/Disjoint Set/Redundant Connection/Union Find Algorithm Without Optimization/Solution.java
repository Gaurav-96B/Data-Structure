class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        if (edges.length == 0){
            return null;
        }
        int parent[] = new int[edges.length+1];
        for (int i=0;i<=edges.length; i++)
        {
            parent[i]=i;
        }
        for (int []edge:edges) {
            int u=find(parent, edge[0]);
            int v=find(parent, edge[1]);
            if (u == v)
                return new int[]{edge[0], edge[1]};
            else
                union(parent, u, v);
        }
        return null;
    }
    public int find(int [] parent, int v) {
        if (parent[v] == v)
        {
            return v;
        }
        return find(parent,parent[v]);
    }
    public void union(int [] parent, int u, int v) {
        int uSet = find(parent, u);
        int vSet = find(parent, v);
        parent[uSet] = vSet;
    } 
}
