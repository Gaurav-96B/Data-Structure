class Solution
{    
    //Left
    //Right
    //Root
    ArrayList<Integer> postOrder(Node root)
    {
      ArrayList<Integer>ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        //left right node ---> node right left
        while(root!=null)
        {
            //if right part does not exist
            if(root.right==null)
            {
                ans.add(root.data);
                root=root.left;
            }
            //if right part exist
            else
            {
              Node curr=root.right;
              while(curr.left!=null&&curr.left!=root)
              {
                  curr=curr.left;
              }
              //If Right Subtree Not Traverse
              if(curr.left==null)
              {
                  ans.add(root.data);
                  curr.left=root;
                  root=root.right;
              }
              //If Right Subtree Traverse
              else
              {
                  curr.left=null;
                  root=root.left;
              }
            }
            
        }
        Collections.reverse(ans);
        return ans;
    }  
    
}

