//NRL-->Node-Right-Left
class Index 
{
    static int postindex = 0;
}
class GFG
{
    public static Node constructTree(int post[],int n)
    {
        Index index = new Index();
        index.postindex = n-1;
        return constructTree(post,index,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static Node constructTree(int post[],Index index,int min,int max)
    {
        if(Index.postindex<0||post[Index.postindex]<=min||post[Index.postindex]>=max)
        {
            return null;
        }
        Node node=new Node(post[index.postindex--]);
        node.right=constructTree(post,index,node.data,max);
        node.left=constructTree(post,index,min,node.data);
        return node;
    }
}
