class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        Set<Integer>set=new LinkedHashSet<>();
        Node temp2=head2;
        while(temp2!=null){
            set.add(temp2.data);
            temp2=temp2.next;
        }
        
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node temp1=head1;
        while(temp1!=null)
        {
            if(set.contains(temp1.data)){
                temp.next=new Node(temp1.data);
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                temp1=temp1.next;

            }
        }
        return dummy.next;
       
    }
}
