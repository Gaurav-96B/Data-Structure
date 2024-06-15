class Solution
{
    public static Node modifyTheList(Node head)
    {
      if(head==null||head.next==null) {
          return head;
      }
      Node mid=findMid(head);
      Node secondHalf=mid.next;
      mid.next=null;
      Node firstHalf=head;
      secondHalf=reverse(secondHalf);
      
      Node curr1=firstHalf;
      Node curr2=secondHalf;
      while(curr2!=null){
          int temp=curr1.data;
          curr1.data=curr2.data-temp;
          curr2.data=temp;
          curr1=curr1.next;
          curr2=curr2.next;
      }
      mid.next=reverse(secondHalf);
      return head;

    }
    public static Node findMid(Node head){
        if(head==null||head.next==null){
            return head;
        }
        
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public static Node reverse(Node head){
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
