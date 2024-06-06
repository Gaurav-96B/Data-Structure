//Method 1
-------------
class Node
{
    int u;
    int w;
    Node(int u,int w)
    {
        this.u=u;
        this.w=w;
    }
}

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> g) {
       int sum=0;
       boolean visited[]=new boolean[V];
       int distance[]=new int[V];
       Arrays.fill(distance,Integer.MAX_VALUE);
       distance[0]=0;
       PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->a.w-b.w);
       pq.add(new Node(0,0));
       while(!pq.isEmpty())
       {
           Node node=pq.poll();
           int u=node.u;
           int Uw=node.w;
           if(visited[u]==true){
               continue;
           }
           visited[u]=true;
           sum=sum+Uw;
           for(int adjacent[]:g.get(u))
           {
              int v=adjacent[0];
              int Vw=adjacent[1];
              if(visited[v]==false&&distance[v]>Vw)
              {
                 distance[v]=Vw;
                 pq.add(new Node(v,distance[v]));
              }
              
           }
       }
       return sum;
    }
}

//Method 2
--------------
class Node
{
    int u;
    int w;
    Node(int u,int w)
    {
        this.u=u;
        this.w=w;
    }
}

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> g) {
       int sum=0;
       boolean visited[]=new boolean[V];
       int distance[]=new int[V];
       Arrays.fill(distance,Integer.MAX_VALUE);
       distance[0]=0;
       PriorityQueue<Node>pq=new PriorityQueue<>((a,b)->a.w-b.w);
       pq.add(new Node(0,0));
       while(!pq.isEmpty())
       {
           Node node=pq.poll();
           int u=node.u;
           int Uw=node.w;
           visited[u]=true;
           for(int adjacent[]:g.get(u))
           {
              int v=adjacent[0];
              int Vw=adjacent[1];
              if(visited[v]==false&&distance[v]>Vw)
              {
                 distance[v]=Vw;
                 pq.add(new Node(v,distance[v]));
              }
              
           }
       }
       
      for(int i=0;i<distance.length;i++){
          sum=sum+distance[i]; 
      }
      return sum;
      
    }
}
  
