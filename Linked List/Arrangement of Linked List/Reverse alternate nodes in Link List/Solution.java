class Solution
{
    public static void rearrange(Node head)
    {
         if(head==null||head.next==null){
           return;
       }
       Node dummyEven=new Node(-1);
       Node tempEven=dummyEven;
       Node dummyOdd=new Node(-1);
       Node tempOdd=dummyOdd;
       
       Node temp=head;
       boolean flag=false;
       while(temp!=null){
           if(flag==false){
              tempEven.next=temp;
              tempEven=tempEven.next;
              temp=temp.next;
              flag=true;
           }
           else{
              tempOdd.next=temp;
              tempOdd=tempOdd.next;
              temp=temp.next;
              flag=false;
           }
       }
       tempEven.next=null;
       tempOdd.next=null;
       dummyOdd.next=reverse(dummyOdd.next);
       tempEven.next=dummyOdd.next;
    }
    
     public static Node reverse(Node head){
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

