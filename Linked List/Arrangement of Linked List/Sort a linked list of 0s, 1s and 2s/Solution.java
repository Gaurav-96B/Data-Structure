class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if(head==null||head.next==null){
            return head;
        }
        Node zeroHead=new Node(-1);
        Node zero=zeroHead;
        Node oneHead=new Node(-1);
        Node one=oneHead;
        Node twoHead=new Node(-1);
        Node two=twoHead;
        
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
                temp=temp.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
                temp=temp.next;
            }
            else {
                two.next=temp;
                two=two.next;
                temp=temp.next;
            }
            
        }
        zero.next=oneHead.next!=null?oneHead.next:twoHead.next;
        one.next=twoHead.next!=null?twoHead.next:null;
        two.next=null;
        
        return zeroHead.next;
    }
}
