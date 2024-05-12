class Solution
{
    static ArrayList <Integer> levelOrder(Node node) 
    {
       ArrayList<Integer>ans=new ArrayList<>();
       if(node==null)
       {
           return ans;
       }
       int height=findHeight(node);
       for(int i=0;i<=height;i++)
       {
           printAtEachLevel(node,i+1,ans);
       }
       return ans;
    }
    public static int findHeight(Node node)
    {
       if(node==null) 
       {
         return 0;  
       }
       return 1+Math.max(findHeight(node.left),findHeight(node.right));
    }
    public static void printAtEachLevel(Node node,int level,ArrayList<Integer>ans)
    {
        if(node==null)
        {
            return;
        }
        if(level==1)
        {
            ans.add(node.data);
        }
        printAtEachLevel(node.left,level-1,ans);
        printAtEachLevel(node.right,level-1,ans);
    }
}

