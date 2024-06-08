//Word search application
class Solution
{
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<dictionary.length;i++)
        {
            boolean ans=exist(board,dictionary[i]);
            if(ans==true)
            {
                a.add(dictionary[i]);
            }
        }
        String finalAns[]=new String[a.size()];
        for(int i=0;i<a.size();i++)
        {
            finalAns[i]=a.get(i);
        }
        return finalAns;
       
    }
    
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean ans=dfs(board,i,j,word,0);
                        if(ans==true)
                        {
                            return true;
                        }
                }
            }
        }
        return false;
 }
 
  public boolean dfs(char board[][],int i,int j,String words,int count)
    {
        if(count==words.length())
        {
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=words.charAt(count))
        {
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean found=dfs(board,i+1,j,words,count+1)||dfs(board,i-1,j,words,count+1)||dfs(board,i,j+1,words,count+1)||dfs(board,i,j-1,words,count+1)||
        dfs(board,i+1,j+1,words,count+1)||dfs(board,i+1,j-1,words,count+1)||dfs(board,i-1,j+1,words,count+1)||dfs(board,i-1,j-1,words,count+1);
        board[i][j]=temp;
        return found;
    }

}
