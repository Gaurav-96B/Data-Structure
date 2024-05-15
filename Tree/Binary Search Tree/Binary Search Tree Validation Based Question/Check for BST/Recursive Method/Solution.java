class Solution
{
    boolean isBST(Node root)
    {
        return isBSTTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean isBSTTree(Node root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min||root.data>=max)
        {
            return false;
        }
        return isBSTTree(root.left,min,root.data)&&isBSTTree(root.right,root.data,max);
        
    }
}
