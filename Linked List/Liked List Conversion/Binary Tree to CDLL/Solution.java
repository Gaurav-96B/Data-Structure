class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
    Node headLinkedList=null;
    Node prev=null;
    Node bTreeToClist(Node root)
    {
        if(root==null){
            return root;
        }
        
        //Step-1:Convert Binary tree to DLL
        headLinkedList=bToDLL(root);
        
        //Step-2:Convert DLL to CDLL
        headLinkedList.left=prev;
        prev.right=headLinkedList;
        return headLinkedList;
    }
    
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
    
