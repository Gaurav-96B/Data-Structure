class Solution
{
    Node flatten(Node root)
    {
        if(root==null||root.next==null){
            return root;
        }
        root.next=flatten(root.next);
        root=mergeLinkedList(root,root.next);
        return root;
    }
    
    Node mergeLinkedList(Node head1,Node head2){
        if(head1==null&&head2==null){
            return head1;
        }
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        
        Node dummy=new Node(-1);
        Node temp=dummy;
        
        while(head1!=null&&head2!=null){
            if(head1.data<head2.data){
                temp.bottom=head1;
                temp=temp.bottom;
                head1=head1.bottom;
            }
            else{
                temp.bottom=head2;
                temp=temp.bottom;
                head2=head2.bottom;
            }
        }
        
        if(head1!=null){
            temp.bottom=head1;
        }
        else{
            temp.bottom=head2;
        }
        return dummy.bottom;
    }

}
