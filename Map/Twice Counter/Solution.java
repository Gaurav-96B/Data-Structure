class Solution
{
    public int countWords(String list[], int n)
    {
        Map<String,Integer>map=new HashMap<>();
        for(String words:list){
            map.put(words,map.getOrDefault(words,0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer>mp:map.entrySet()){
            if(mp.getValue()==2){
                count++;
            }
        }
        return count;
    }
}
