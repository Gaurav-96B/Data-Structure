class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        int brackerNumber=1;
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Integer>bracketNumberStack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans.add(brackerNumber);
                bracketNumberStack.add(brackerNumber);
                brackerNumber++;
            }
            else if(s.charAt(i)==')'){
                ans.add(bracketNumberStack.peek());
                bracketNumberStack.pop();
            }
        }
        return ans;
    }
};
