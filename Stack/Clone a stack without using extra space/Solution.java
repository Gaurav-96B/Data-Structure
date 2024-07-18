class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        solve(st,cloned);
        return;
    }
    void solve(Stack<Integer> st, Stack<Integer> cloned){
        if(st.size()==0){
            return;
        }
        int z=st.pop();
        solve(st,cloned);
        cloned.push(z);
    }
}
