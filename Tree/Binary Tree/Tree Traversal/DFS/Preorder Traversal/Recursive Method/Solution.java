class Solution
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
      ArrayList<Integer>ans = new ArrayList<>();
      preOrder(root,ans);
      return ans;
    }
    
    static void preOrder(Node node, ArrayList<Integer>ans)
    {
        if(node==null)
        {
           return; 
        }
        ans.add(node.data);
        preOrder(node.left,ans);
        preOrder(node.right,ans);
        return;
    }
  
}
