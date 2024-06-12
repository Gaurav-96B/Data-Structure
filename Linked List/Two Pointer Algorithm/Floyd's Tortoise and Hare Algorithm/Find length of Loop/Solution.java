class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        if(head==null){
            return 0;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               return findlength(slow,fast);
           }
        }
        return 0;
    }
    
    static int findlength(Node slow,Node fast)
    {
        fast=fast.next;
        int count=1;
        while(slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }
}
