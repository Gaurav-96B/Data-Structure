class Complete {
    // Function for finding maximum and value pair
    public static String maximumFrequency(String s) {
        Map<String,Integer>map=new LinkedHashMap<>();
        String words[]=s.split(" ");
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        
        String word="";
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer>mp:map.entrySet()){
            if(mp.getValue()>max){
                word=mp.getKey();
                max=mp.getValue();
            }
        }
        return word+" "+max;
    }
}
