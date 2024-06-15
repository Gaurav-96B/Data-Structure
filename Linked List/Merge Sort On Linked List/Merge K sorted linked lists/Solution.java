class Solution
{
    //Function to merge K sorted linked list.
    Node mergeKList(Node[]arr,int K)
    {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<K;i++){
            Node temp=arr[i];
            while(temp!=null){
                q.add(temp.data);
                temp=temp.next;
            }
        }
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(!q.isEmpty()){
           temp.next=new Node(q.poll());
           temp=temp.next;
        }
        return dummy.next;
    }
}
