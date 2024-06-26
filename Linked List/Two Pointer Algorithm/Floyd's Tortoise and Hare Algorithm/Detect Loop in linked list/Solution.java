/*
Floyd's Cycle Detection Algorithm known as Floyd's Tortoise and Hare Algorithm
Slow pointer=>tortoise
Fast Pointer=>hare
*/

class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        if(head==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
