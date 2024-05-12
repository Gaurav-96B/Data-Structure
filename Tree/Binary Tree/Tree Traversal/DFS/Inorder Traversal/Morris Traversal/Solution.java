class Solution {
    //Left
    //Root
    //Right
    ArrayList<Integer> inOrder(Node root) {
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
                  curr.right=root;
                  root=root.left;
              }
              //If left Subtree Traverse
              else
              {
                  curr.right=null;
                  ans.add(root.data);
                  root=root.right;
              }
            }
            
        }
        return ans;
    }
}
