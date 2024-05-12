class Solution
{    
    //Root
    //Left
    //Right
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        while(root!=null)
        {
            //if left part does not exist
            if(root.left==null)
            {
                ans.add(root.data);
                root=root.right;
            }
            //if left part exist
            else
            {
              Node curr=root.left;
              while(curr.right!=null&&curr.right!=root)
              {
                  curr=curr.right;
              }
              //If left Subtree Not Traverse
              if(curr.right==null)
              {
                  ans.add(root.data);
                  curr.right=root;
                  root=root.left;
              }
              //If left Subtree Traverse
              else
              {
                  curr.right=null;
                  root=root.right;
              }
            }
            
        }
        return ans;
    }
}
