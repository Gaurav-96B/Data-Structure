class Intersect
{
  //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
      // Initialize two pointers
    Node c1 = head1, c2 = head2;
    
    // Loop until the two pointers meet
    while (c1 != c2) {
        // Move to the next node or switch to the other list's head
        c1 = (c1 == null) ? head2 : c1.next;
        c2 = (c2 == null) ? head1 : c2.next;
    }
    
    // If they meet at null, it means there's no intersection
    if (c1 == null) {
        return -1;
    }

    // Return the intersection point data
    return c1.data;
      
	}
}
