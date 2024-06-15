class Solution {
    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node l1, Node l2) {
        /*if(l1==null||l2==null){
            return l1!=null ? l1:l2;
        }*/
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        Node c1=reverse(l1);
        Node c2=reverse(l2);
        Node head=new Node(-1);
        Node itr=head;
        int carry=0;
        while(c1!=null||c2!=null||carry!=0){
            int sum=carry+(c1!=null?c1.data:0)+(c2!=null?c2.data:0);
            int ld=sum%10;
            carry=sum/10;
            itr.next=new Node(ld);
            itr=itr.next;
            if(c1!=null){
                c1=c1.next;
            }
            if(c2!=null){
                c2=c2.next;
            }
        }
        head=reverse(head.next);
        
        //Remove Leading Zero
        while(head.next!=null&&head.data==0){
            head=head.next;
        }
        return head;
    }
    
    static  Node reverse(Node head) {
        if(head==null||head.next==null){
            return head;
        }
        
        Node prev=null;
        Node curr=head;
        Node front=head;
        while(curr!=null){
            front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        head=prev;
        return head;  
    }
    
}
