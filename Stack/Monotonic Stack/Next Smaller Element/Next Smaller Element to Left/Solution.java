class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer>ans=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty()&&stack.peek()>=a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(stack.peek());
             }
            stack.push(a[i]);

    }
    return ans;
}
}
