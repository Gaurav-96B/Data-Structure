class Solution {
    public int findSubString( String str) {

        Set<Character>set = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        int distChar = set.size();
        
        Map<Character,Integer>map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        int startIndex=0;
        for(int endIndex=0;endIndex<str.length();endIndex++){
            map.put(str.charAt(endIndex),map.getOrDefault(str.charAt(endIndex),0)+1);
            
                while(map.size()==distChar){
                    min=Math.min(min,endIndex-startIndex+1);
                    
                    if(map.get(str.charAt(startIndex))==1){
                        map.remove(str.charAt(startIndex));
                    }
                    else{
                        map.put(str.charAt(startIndex),map.getOrDefault(str.charAt(startIndex),0)-1);
                    }
                    startIndex++;
                }
            }
        return min;
    }
}
