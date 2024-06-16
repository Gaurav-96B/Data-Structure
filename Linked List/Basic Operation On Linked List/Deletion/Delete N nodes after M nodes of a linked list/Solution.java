class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        if(head==null){
            return;
        }
        
        Node prev=null;
        Node curr=head;
        int count=1;
        while(curr!=null){
            for(count=1;count<=M&&curr!=null;count++){
                prev=curr;
                curr=curr.next;
            }
            if(curr==null){
                return;
            }
            for(count=1;count<=N&&curr!=null;count++){
                curr=curr.next;
            }
            prev.next=curr;
            prev=curr;
        }
    }
}


