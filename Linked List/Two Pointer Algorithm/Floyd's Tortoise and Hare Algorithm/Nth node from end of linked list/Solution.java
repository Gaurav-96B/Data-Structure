class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	if(head==null){
    	    return -1;
    	}
    	Node slow=head;
    	Node fast=head;
    	for(int i=1;i<n;i++){
    	    if(fast!=null){
    	    fast=fast.next;
    	    }
    	}
    	
    	if(fast==null){
    	    return -1;
    	}
    	while(fast.next!=null){
    	    slow=slow.next;
    	    fast=fast.next;

    	}
    	return slow.data;
    }
}
