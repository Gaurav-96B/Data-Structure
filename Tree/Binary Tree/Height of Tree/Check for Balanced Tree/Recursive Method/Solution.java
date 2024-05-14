// -1<=height(l)-height(r)<=1
//(-1,0,1)
class Solution
{
    boolean isBalanced(Node root)
    {
     if(height(root)>0){
     return true;
     }
     else{
     return false;
     }
    }
    int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        if(leftHeight==-1)
        {
            return -1;
        }
        int righHeight=height(root.right);
        if(righHeight==-1)
        {
            return -1;
        }
        if(Math.abs(leftHeight-righHeight)>1)
        {
            return -1;
        }
        else
        {
        return 1+Math.max(leftHeight,righHeight);
        }
    }
}
