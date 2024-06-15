class Solution
{
   public static Tree convert(Node head, Tree node) {
       ArrayList<Integer>linkedListNode=new ArrayList<>();
       Node temp=head;
       while(temp!=null){
          linkedListNode.add(temp.data);
          temp=temp.next;
       }
       return convertTree(linkedListNode,node,0);
       
    }
    public static Tree convertTree(ArrayList<Integer>linkedListNode,Tree treeNode,int i)
    {
       if(i==linkedListNode.size()) {
         return null;  
       }
       //Parent Node
       treeNode=new Tree(linkedListNode.get(i));
       
       //Left Child
       if(2*i+1<linkedListNode.size()){
       treeNode.left=convertTree(linkedListNode,treeNode,2*i+1);
       }
       
       //Right Child
       if(2*i+2<linkedListNode.size()){
       treeNode.right=convertTree(linkedListNode,treeNode,2*i+2);
       }
       return treeNode;
    }
}  
