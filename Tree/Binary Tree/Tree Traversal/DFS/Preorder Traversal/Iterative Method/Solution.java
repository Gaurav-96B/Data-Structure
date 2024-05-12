class Solution
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
      ArrayList<Integer>ans = new ArrayList<>();
      if(root==null)
      {
          return ans;
      }
      Stack<Node>stack = new Stack<>();
      stack.push(root);
      while(!stack.isEmpty())
      {
          Node node=stack.pop();
          ans.add(node.data);
          if(node.right!=null)
          {
              stack.push(node.right);
              
          }
          if(node.left!=null)
          {
              stack.push(node.left);
          }
      }
      return ans;
    }
    

}
