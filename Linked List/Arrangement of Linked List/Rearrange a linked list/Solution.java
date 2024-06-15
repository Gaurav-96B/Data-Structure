
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
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
              if(flag==true){
                  tempEven.next=temp;
                  tempEven=tempEven.next;
                  temp=temp.next;
                  flag=false;
              }
              else{
                  tempOdd.next=temp;
                  tempOdd=tempOdd.next;
                  temp=temp.next;
                  flag=true;
              }
          }
          tempEven.next=null;
          tempOdd.next=null;
          tempOdd.next=dummyEven.next;

          
     }
}
