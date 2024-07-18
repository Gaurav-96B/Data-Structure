class solve{
    //Function to generate binary numbers from 1 to N using a queue.
     static ArrayList<String> generate(int N)
    {
       ArrayList<String>ans=new ArrayList<>();
       Queue<String>queue=new LinkedList<>();
       queue.add("1");
       for(int i=1;i<=N;i++){
           String front=queue.peek();
           queue.poll();
           ans.add(front);
           queue.add(front+ "0");
           queue.add(front+ "1");
           
       }
       return ans;
    }
}
