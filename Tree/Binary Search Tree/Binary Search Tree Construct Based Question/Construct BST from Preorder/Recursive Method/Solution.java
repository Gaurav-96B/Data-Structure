static class Index 
{
  static int preindex = 0;
}
static class Solution
{
    public static Node Bst(int pre[],int n)
    {
        Index index = new Index();
        index.preindex = 0;
        return constructTree(pre,index,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static Node constructTree(int pre[],Index index,int min,int max)
    {
        if(Index.preindex==pre.length||pre[Index.preindex]<=min||pre[Index.preindex]>=max)
        {
            return null;
        }
        Node node=new Node(pre[index.preindex++]);
        node.left=constructTree(pre,index,min,node.data);
        node.right=constructTree(pre,index,node.data,max);
        return node;
    }
}
