class Solution {
    public Node sortedInsert(Node head, int data) {
        Node newNode=new Node(data);
        Node curr=head;
        
        //Case-1:Head is null
        if(head==null){
            newNode.next=newNode;
            head=newNode;
            return head;
        }
        
        //Case-2:Insert At Head
        else if(data<=head.data){
            while(curr.next!=head){
                curr=curr.next;
            }
            curr.next=newNode;
            newNode.next=head;
            head=newNode;
            return head;
        }
        
        //Case-3:Insert At Position
        else{
            while(curr.next!=head&&data>curr.next.data){
                curr=curr.next;
            }
            newNode.next=curr.next;
            curr.next=newNode;
            return head;
            
        }
    }
}
