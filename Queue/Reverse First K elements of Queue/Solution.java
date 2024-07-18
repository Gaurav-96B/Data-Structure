class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        int remainingElement=q.size()-k;
        Stack<Integer>stack=new Stack<>();
        while(k>0){
            stack.push(q.peek());
            q.poll();
            k--;
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        
        while(remainingElement>0){
            q.add(q.peek());
            q.poll();
            remainingElement--;
        }
        return q;
        
    }
}
