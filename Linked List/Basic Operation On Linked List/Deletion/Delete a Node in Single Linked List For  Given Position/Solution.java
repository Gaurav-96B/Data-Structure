class GfG
{
    Node deleteNode(Node head, int x)
    {
        if(head==null||x==0){
            return head;
        }
        Node prev=null;
        Node temp=head;
        int count=1;
        
        //Case-1:Deleting head node
        if(x==1){
            head=head.next;
            return head;
        }
        //Case-2:Deleting mid and tail node
        else{
            while(temp!=null){
                if(count==x){
                    prev.next=prev.next.next;
                    break;
                }
                else{
                    prev=temp;
                    temp=temp.next;
                    count++;
                }
                
            }
        }
        return head;
        
    }
}
