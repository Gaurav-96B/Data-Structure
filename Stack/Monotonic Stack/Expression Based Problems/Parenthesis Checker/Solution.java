class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<x.length();i++){
            char openingBracket=x.charAt(i);
            if(openingBracket=='{' 
            || openingBracket=='('
            || openingBracket=='['){
                stack.push(openingBracket);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char closingBracket=stack.pop();
                if((closingBracket== '{' && openingBracket== '}')
                || (closingBracket== '(' && openingBracket== ')')
                || (closingBracket== '[' && openingBracket== ']')){
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
