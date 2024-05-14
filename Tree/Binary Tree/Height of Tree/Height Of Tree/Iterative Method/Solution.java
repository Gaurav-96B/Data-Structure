class Solution {
    int height(Node node) 
    {
       if(node==null)
       {
           return 0;
       }
       int height=0;
       Queue<Node>queue=new LinkedList<>();
       queue.add(node);
       while(!queue.isEmpty())
       {
           int size=queue.size();
           if(size!=0)
           {
              height++; 
           }
           for(int i=0;i<size;i++)
           {
               Node temp=queue.poll();
               if(temp.left!=null)
               {
                   queue.add(temp.left);
               }
               if(temp.right!=null)
               {
                   queue.add(temp.right);
               }
           }
       }
       return height;
    }
}

