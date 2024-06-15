class Solution
{
    public static Node addPolynomial(Node p1,Node p2)
    {
        Node dummyNode=new Node(-1,0);
        Node temp=dummyNode;
        while(p1!=null&&p2!=null){
            if(p1.pow==p2.pow){
                temp.next=new Node(p1.coeff+p2.coeff,p1.pow);
                temp=temp.next;
                p1=p1.next;
                p2=p2.next;
            }
            else if(p1.pow>p2.pow){
              temp.next=new Node(p1.coeff,p1.pow);
              temp=temp.next;
              p1=p1.next;
            }
            else{
               temp.next=new Node(p2.coeff,p2.pow);
               temp=temp.next;
               p2=p2.next;
            }
        }
        if(p1!=null){
          temp.next=new Node(p1.coeff,p1.pow);
        }
        if(p2!=null){
          temp.next=new Node(p2.coeff,p2.pow);
        }
        return dummyNode.next;
    }
}
