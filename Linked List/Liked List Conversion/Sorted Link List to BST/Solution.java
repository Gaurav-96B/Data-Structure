class Solution
{
    public TNode sortedListToBST(LNode head)
    {
       if(head==null){
            return null;
        }
        
       LNode mid=findMid(head);
       
       TNode treeNode=new TNode(mid.data);
       if(head==mid){
           return treeNode;
       }
       
       treeNode.left=sortedListToBST(head);
       treeNode.right=sortedListToBST(mid.next);
       return treeNode;
       
    }
    
    public LNode findMid(LNode head)
    {
        if(head==null||head.next==null){
            return head;
        }
        LNode prev=head;
        LNode slow=head;
        LNode fast=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
        
    }
}
