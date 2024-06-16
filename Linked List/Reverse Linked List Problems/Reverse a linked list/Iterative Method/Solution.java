class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
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
}
