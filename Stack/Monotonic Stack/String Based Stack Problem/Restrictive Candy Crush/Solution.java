class Pair {
    Character character;
    Integer count;

    Pair(Character character, Integer count) {
        this.character = character;
        this.count = count;
    }
}
class Solution {
    public static String reduced_String(int k, String s) {
        StringBuilder ans = new StringBuilder();
        if (k == 1) {
            return ans.toString();
        }
        Stack < Pair > stack = new Stack < > ();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(new Pair(s.charAt(i), 1));
            } else if (stack.peek().character == s.charAt(i)) {
                stack.push(new Pair(s.charAt(i), stack.peek().count + 1));
                if (stack.peek().count == k) {
                    int x = k;
                    while (x != 0) {
                        stack.pop();
                        x--;
                    }
                }
            } else if (stack.peek().character != s.charAt(i)) {
                stack.push(new Pair(s.charAt(i), 1));
            }
        }
        while (!stack.isEmpty()) {
            ans.append(stack.peek().character);
            stack.pop();
        }
        return ans.reverse().toString();

    }
}
