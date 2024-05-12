class Solution
{
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        postOrderTraversal(root,ans);
        return ans;
    }
    public void postOrderTraversal(Node root,ArrayList<Integer>ans)
    {
       if(root==null) 
       {
           return;
       }
       postOrderTraversal(root.left,ans);
       postOrderTraversal(root.right,ans);
       ans.add(root.data);
    }
}
