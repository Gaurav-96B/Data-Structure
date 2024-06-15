class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    return merge(mergeSort(head1),mergeSort(head2));
	}
	
	public static Node mergeSort(Node head)
    {
        if(head==null||head.next==null){
            return head;
        }
        
        Node mid=findMid(head);
        Node leftNode=mergeSort(head);
        Node rightNode=mergeSort(mid);
        return merge(leftNode,rightNode);
    }
    
	public static Node findMid(Node head)
     {
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
         prev.next=null;
         return slow;
     }
     
     public static Node merge(Node head1,Node head2)
     {
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1!=null&&head2!=null)
        {
            if(head1.data<head2.data){
              temp.next=head1;
              temp=temp.next;
              head1=head1.next;
            }
            else if(head1.data>head2.data){
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
            else{
	           temp.next=head1;
	           temp=temp.next;
	           head1=head1.next;
	           head2=head2.next;
	        }
        }
        if(head1!=null){
            temp.next=head1;
        }
        else{
            temp.next=head2;
        }
        return dummy.next;
    }
}
