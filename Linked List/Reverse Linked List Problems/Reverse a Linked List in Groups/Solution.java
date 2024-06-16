class Solution
{
    public static Node reverse(Node head, int k)
    {
        if(head==null||k==0){
            return head;
        }
        
        //Step-1
        Node first=new Node(-1);
        first.next=head;
        head=first;
        
        //Step-2
        Node second=null;
        Node prev=null;
        Node curr=null;
        Node front=null;
        int x=k;
        
        //Step-3
        while(first.next!=null){
            x=k;
            second=first.next;
            prev=first;
            curr=second;
            front=first.next;
            
            //Step-4
            while(x!=0&&curr!=null){
                front=curr.next;
                curr.next=prev;
                prev=curr;
                curr=front;
                x--;
            }
            //Step-5
            first.next=prev;
            second.next=curr;
            first=second;
        }
        
        //Step-6
        first=head;
        head=head.next;
        return head;
        
    }
}

