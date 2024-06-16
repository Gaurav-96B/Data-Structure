class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        if(head==null||head.next==null){
            return head;
        }
        
        Set<Integer>set=new HashSet<>();
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            if(set.contains(curr.data)){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                set.add(curr.data);
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}
