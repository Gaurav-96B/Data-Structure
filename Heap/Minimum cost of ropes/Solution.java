class Solution {
    public int minCost(int[] a) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
	            q.add(a[i]);
        }
        
	    int sum=0;
	    while(q.size()>1){
	       int z= q.poll()+q.poll();
	       sum=sum+z;
	       q.add(z);
	   }
	   return sum;
        
    }
}
