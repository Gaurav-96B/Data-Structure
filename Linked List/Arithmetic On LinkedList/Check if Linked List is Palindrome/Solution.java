/*TC:O(n)
SC:O(1)*/
class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        Node firstHalf=head;
        Node secondHalf=findMid(head);
        secondHalf=reverse(secondHalf);
        
        while(firstHalf!=null&&secondHalf!=null){
            if(firstHalf.data!=secondHalf.data){
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        return true;
    }
    
    Node findMid(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prev=head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
        
    }
    
    Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prev=head;
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

