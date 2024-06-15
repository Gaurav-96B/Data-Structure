class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node headLinkedList=null;
    Node prev=null;
    Node bToDLL(Node root)
    {
        if(root==null){
            return root;
        }
        
        //Step-1
        bToDLL(root.left);
        
        //Step-2
        if(prev==null){
            headLinkedList=root;
            prev=root;
        }
        else{
            prev.right=root;
            root.left=prev;
            prev=root;
        }
        
        
        //Step-3
        bToDLL(root.right);
        
        return headLinkedList;
    }
}
