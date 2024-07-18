class Solution{
    static String decodedString(String s){
        int num=0;
        Stack<Integer> ns=new Stack<>();
        Stack<StringBuilder> ss=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                ss.push(ans);
                ans=new StringBuilder();
                ns.push(num);
                num=0;
            }
            else if(c==']'){
                StringBuilder temp=ans;
                ans=ss.pop();
                int count=ns.pop();
                while(count-->0)
                    ans.append(temp);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
