class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	  ArrayList<Integer>ans=new ArrayList<>();
	  if(node==null)
	  {
	      return ans;
	  }
	  ans.add(node.data);
	  if(node.left==null&&node.right==null)
	  {
	  return ans;
	  }
	  //Traverse left subtree except leaf node
	  leftSubtreeTraversal(node.left,ans);
	  //Traverse LeafNode
	  leafNodeTraversal(node,ans);
	  //Traverse right subtree except leaf node
	  rightSubtreeTraversal(node.right,ans);
	  return ans;
	}
	void leftSubtreeTraversal(Node node,ArrayList<Integer>ans)
	{
	    if(node==null||node.left==null&&node.right==null)
	    {
	        return;
	    }
	    ans.add(node.data);
	    if(node.left!=null)
	    {
	      leftSubtreeTraversal(node.left,ans); 
	    }
	    else
	    {
	       leftSubtreeTraversal(node.right,ans);
	    }
	}
	void leafNodeTraversal(Node node,ArrayList<Integer>ans)
	{
	    if(node==null)
	    {
	        return;
	    }
	    if(node.left==null&&node.right==null)
	    {
	    ans.add(node.data);
	    }
	    leafNodeTraversal(node.left,ans); 
	    leafNodeTraversal(node.right,ans);
	}
	
	void rightSubtreeTraversal(Node node,ArrayList<Integer>ans)
	{
	    if(node==null||node.left==null&&node.right==null)
	    {
	        return;
	    }
	    if(node.right!=null)
	    {
	      rightSubtreeTraversal(node.right,ans); 
	    }
	    else
	    {
	      rightSubtreeTraversal(node.left,ans);
	    }
	    ans.add(node.data);

	}
}
