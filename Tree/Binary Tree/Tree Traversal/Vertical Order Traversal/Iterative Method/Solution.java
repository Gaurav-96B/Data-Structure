//User function Template for Java
class Pair
{
    Node node;
    int hd;
    Pair(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        Map<Integer,ArrayList<Integer>>map=new TreeMap<>();
        
        while(!queue.isEmpty())
        {
          Pair p=queue.poll();
          Node temp=p.node;
          int hd=p.hd;
          
          map.putIfAbsent(hd,new ArrayList<>());
          map.get(hd).add(temp.data);
          
        //   if(map.containsKey(hd)==false)
        //   {
        //       ArrayList<Integer>ans1=new ArrayList<>();
        //       ans1.add(temp.data);
        //       map.put(hd,ans1);
        //   }
        //   else
        //   {
        //       ArrayList<Integer>ans1=map.get(hd);
        //       ans1.add(temp.data);
        //       map.put(hd,ans1);
   
        //   }
        
          if(temp.left!=null){
                 queue.add(new Pair(temp.left,hd-1));
             }
          if(temp.right!=null){
                 queue.add(new Pair(temp.right,hd+1));
             }
        }
        
        for(Map.Entry<Integer,ArrayList<Integer>> me:map.entrySet()){
             ans.addAll(me.getValue());
        }
    return ans;
    }
}
