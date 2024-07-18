class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        long ans[]=new long[n];
        Stack<Long>stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=stack.peek();
                }
            }
            stack.push(arr[i%n]);
        }
        return ans;
    } 
}
