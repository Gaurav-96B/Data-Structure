class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        //Step-1
        int length=1;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;
        
        //Step-2
        if(k>=length){
            k=k%length;
            k=length-k;
        }
        
        //Step-3
        while(k-->0){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
