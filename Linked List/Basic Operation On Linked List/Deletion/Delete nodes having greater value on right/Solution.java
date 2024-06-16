class Solution
{
    Node compute(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        
        head=reverse(head);
        Node curr=head;

        while(curr.next!=null){
            if(curr.data>curr.next.data){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return reverse(head);
    }
    
    Node reverse(Node head){
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
}
  
