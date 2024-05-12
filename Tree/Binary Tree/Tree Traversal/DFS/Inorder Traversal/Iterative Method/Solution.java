//First Approach
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans = new ArrayList<>();
        Stack<Node>stack = new Stack<>();
        Node node = root;
        while(true)
        {
            if(node!=null)
            {
                stack.push(node);
                node= node.left;
            }
            else
            {
               if(stack.isEmpty())
               {
                   break;
               }
               node = stack.pop();
               ans.add(node.data);
               node= node.right;
            }
        }
        return ans;
    }
}
//Second Approach
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans = new ArrayList<>();
        Stack<Node>stack = new Stack<>();
        Node node = root;
        while(node!=null||!stack.isEmpty())
        {
            if(node!=null)
            {
                stack.push(node);
                node= node.left;
            }
            else
            {
               node = stack.pop();
               ans.add(node.data);
               node= node.right;
            }
        }
        return ans;
    }
}
