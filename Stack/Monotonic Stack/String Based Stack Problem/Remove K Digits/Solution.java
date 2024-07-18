class Solution {
    public String removeKdigits(String S, int K) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            while(!stack.isEmpty() && stack.peek()>S.charAt(i) && K>0){
            stack.pop();
            K--;
            }
            if(stack.isEmpty() && S.charAt(i)=='0'){
            continue;
            }
            else{
            stack.push(S.charAt(i));
            }
        }
        
        while(!stack.isEmpty() && K>0){
            stack.pop();
            K--;
        }
        if(stack.isEmpty()){
        return "0";
        }
        StringBuilder sb=new StringBuilder("");
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String str=sb.reverse().toString();
        return str;
    }
}
