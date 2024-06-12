class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        if(head==null){
            return -1;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                return firstNode(slow,fast);
            }
        }
        return -1;
    }
    public static int firstNode(Node slow,Node fast){
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
        
    }
}
