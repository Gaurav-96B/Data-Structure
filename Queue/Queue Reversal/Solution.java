class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer>stack=new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.peek());
            q.poll();
        }
        while(!stack.isEmpty()){
            q.add(stack.peek());
            stack.pop();
        }
        return q;
    }
}
