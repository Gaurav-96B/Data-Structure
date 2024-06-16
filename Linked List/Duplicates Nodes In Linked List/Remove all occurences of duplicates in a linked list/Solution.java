class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        
        Node dummy=new Node(-1);
        dummy.next=head;
        Node tempNode=dummy;
        
        Node temp=head;
        while(temp!=null){
            if(temp.next!=null&&temp.data==temp.next.data){
                while(temp.next!=null&&temp.data==temp.next.data){
                    temp=temp.next;
                }
                tempNode.next=temp.next;
                temp=temp.next;

            }
            else{
                tempNode=tempNode.next;
                temp=temp.next;
            }
            
        }
        return dummy.next;
            
    }
}
