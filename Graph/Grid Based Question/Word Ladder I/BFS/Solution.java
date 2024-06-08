class Solution
{
    public int wordLadderLength(String beginWord, String endWord, String[] wordList)
    {
        if (!Arrays.asList(wordList).contains(endWord)) {
        return 0;
        }
        
       Map<String, Boolean> map = new HashMap<String, Boolean>();
       for(int i = 0; i <wordList.length; i++){
            map.put(wordList[i], false);
       }
       
        int length = 1;
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        map.put(beginWord, true);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String w = queue.poll();
                if (w.equals(endWord)) {
                     return length;
                }
                wordMatch(w, map, queue);
            }
            length++;
        }
        return 0;
    }
    
    public void wordMatch(String w, Map<String, Boolean> map, Queue<String> queue) {
        for (int i = 0; i < w.length(); i++) {
            char[] word = w.toCharArray();
            for (int j = 0; j < 26; j++) {
                char c = (char) ('a' + j);
                word[i] = c;
                String s = String.valueOf(word);
                if (map.containsKey(s) && map.get(s) == false) {
                    queue.add(s);
                    map.put(s, true);
                }
            }
        }
    }

}
