class Solution
{    
    //Left
    //Right
    //Root
    ArrayList<Integer> postOrder(Node root)
    {
      ArrayList<Integer>ans = new ArrayList<>();
      if(root==null)
      {
          return ans;
      }
      Stack<Node>stack = new Stack<>();
      stack.add(root);
      while(!stack.isEmpty())
      {
          Node node=stack.pop();
          ans.add(node.data);
          if(node.left!=null)
          {
              stack.add(node.left);
              
          }
          if(node.right!=null)
          {
              stack.add(node.right);
          }
      }
      Collections.reverse(ans);
      return ans;
    }     
}

