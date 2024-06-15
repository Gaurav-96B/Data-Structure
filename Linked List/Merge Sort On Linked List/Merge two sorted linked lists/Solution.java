class LinkedList
{
    //Function to merge two sorted linked list.
     Node sortedMerge(Node temp1, Node temp2) {
     Node dummyNode=new Node(-1);
     Node temp=dummyNode;
     while(temp1!=null&&temp2!=null)
     {
         if(temp1.data<temp2.data){
             temp.next=temp1;
             temp=temp.next;
             temp1=temp1.next;
         }
         else{
            temp.next=temp2;
            temp=temp.next;
            temp2=temp2.next;
         }
         
     }
     if(temp1!=null){
         temp.next=temp1;
     }
     else{
         temp.next=temp2;
     }
     return dummyNode.next;
   } 
}
