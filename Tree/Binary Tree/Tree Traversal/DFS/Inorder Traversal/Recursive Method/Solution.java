class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans = new ArrayList<>();
        inOrderTraversal(root,ans);
        return ans;
    }
    void inOrderTraversal(Node root,ArrayList<Integer>ans)
    {
        if(root==null)
        {
            return;
        }
        inOrderTraversal(root.left,ans);
        ans.add(root.data);
        inOrderTraversal(root.right,ans);
    }
}
