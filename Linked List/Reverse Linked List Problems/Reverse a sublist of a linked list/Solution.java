class Solution
{
    public static Node reverseBetween(Node head, int m, int n)
    {
        Node first=new Node(-1);
        first.next=head;
        head=first;

        Node prev=first;
        for(int i=1;i<m;i++){
            prev=prev.next;
        }
        
        first=prev;
        Node second=prev.next;
        Node curr=prev.next;
        Node front=first.next;
        
        for(int i=m;i<n+1;i++)
        {
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        first.next=prev;
        second.next=curr;
        return head.next;
    }
}
