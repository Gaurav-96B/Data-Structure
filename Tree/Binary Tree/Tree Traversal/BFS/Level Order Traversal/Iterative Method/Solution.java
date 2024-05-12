//First Approach
class Solution
{
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
           int size=queue.size();
           for(int i=0;i<size;i++)
           {
            Node temp=queue.poll();
            ans.add(temp.data);
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
        return ans;
    }
}

//Second Approach
class Solution
{
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer>ans=new ArrayList<Integer>();
        if(root==null)
        {
            return ans;
        }
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp=queue.poll();
            ans.add(temp.data);
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
        return ans;
    }
}

