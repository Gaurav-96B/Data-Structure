class Solution{
    static int maxLength(String x){
        int max=0;
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<x.length();i++){
            char openingBracket=x.charAt(i);
            if(openingBracket=='('){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max=Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }
}
