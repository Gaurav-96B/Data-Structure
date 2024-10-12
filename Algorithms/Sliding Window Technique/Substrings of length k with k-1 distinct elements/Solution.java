class Solution {
    static int countOfSubstrings(String S, int K) {
        Map<Character,Integer>map=new HashMap<>();
        int startIndex=0;
        int count=0;
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
            if(i>=K-1){
                if(map.size()==K-1){
                    count++;
                }
                if(map.get(S.charAt(startIndex))==1){
                    map.remove(S.charAt(startIndex));
                }
                else{
                    map.put(S.charAt(startIndex),map.get(S.charAt(startIndex))-1);
                }
                startIndex++;
            }
        }
        return count;
    }
};
