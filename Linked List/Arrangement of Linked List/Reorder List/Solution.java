
class Solution {
    void reorderlist(Node head) {
         if(head==null||head.next==null)
        {
            return;
        }
        Node mid=findMid(head);
        Node n1=head;
        Node n2=reverse(mid);
        merge(n1,n2);
        
    }
    Node findMid(Node head)
    {
       if(head==null|head.next==null){
           return head;
       } 
       Node prev=head;
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null){
           prev=slow;
           slow=slow.next;
           fast=fast.next.next;
       }
       prev.next=null;
       return slow;
       
    }
    Node reverse(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        Node front=head;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        head=prev;
        return head;
        
    }
    Node merge(Node n1,Node n2)
    {
       Node dummy=new Node(-1);
       dummy.next=n1;
       while(n2!=null){
           Node next=n1.next;
           n1.next=n2;
           n1=n2;
           n2=next;
       }
       return dummy.next;
    }
}
