
class Solution {
    
    public long[] printFirstNegativeInteger(long a[], int n, int k)
    {
        Queue<Long>queue=new LinkedList<>();
        long result[]=new long[n-k+1];
        int idx=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                queue.add(a[i]);
            }
            if(i>=k-1){
                if(queue.size()==0){
                    result[idx++]=0;
                }
                else{
                    if(a[i-(k-1)]==queue.peek()){
                       result[idx++]=queue.poll();

                    }
                    else{
                    result[idx++]=queue.peek();
                    }
                }
            }
        }
        return result;
    }
}
