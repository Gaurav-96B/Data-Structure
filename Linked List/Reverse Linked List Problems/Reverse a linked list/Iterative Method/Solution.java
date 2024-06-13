class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        head=prev;
        return head;
    }
}
