class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' 
            || x.charAt(i)=='('
            || x.charAt(i)=='['){
                stack.push(x.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char openingBracket=stack.pop();
                char closingBracket=x.charAt(i);
                if((openingBracket== '{' && closingBracket== '}')
                || (openingBracket== '(' && closingBracket== ')')
                || (openingBracket== '[' && closingBracket== ']')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
