class Solution {
    public static Node partition(Node head, int x) {
        if(head==null){
            return head;
        }
        Node dummy1=new Node(-1);
        Node n1=dummy1;
        Node dummy2=new Node(-1);
        Node n2=dummy2;
        Node dummy3=new Node(-1);
        Node n3=dummy3;
        
        Node temp=head;
        while(temp!=null){
            if(temp.data<x){
                n1.next=temp;
                n1=n1.next;
                temp=temp.next;
            }
            else if(temp.data==x){
                n2.next=temp;
                n2=n2.next;
                temp=temp.next;
            }
            else{
                n3.next=temp;
                n3=n3.next;
                temp=temp.next;
            }
        }
        
        n1.next=dummy2.next!=null?dummy2.next:dummy3.next;
        n2.next=dummy3.next!=null?dummy3.next:null;
        n3.next=null;
        return dummy1.next;
    }
}
