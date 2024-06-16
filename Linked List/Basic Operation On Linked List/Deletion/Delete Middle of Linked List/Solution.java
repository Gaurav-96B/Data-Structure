class Solution {
    Node deleteMid(Node head) {
       if(head==null||head.next==null){
           return null;
       }
       
       Node midPrev=findMid(head);
       midPrev.next=midPrev.next.next;
       
       return head;
    }
    Node findMid(Node head){
        if(head==null||head.next==null){
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
        return prev;
    }
}
