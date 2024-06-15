class Solution {

    public Node arrangeCV(Node head){
        Node dummyConsonants =new Node(Character.MIN_VALUE);
        Node tempConsonants=dummyConsonants;
        Node dummyVowel=new Node(Character.MIN_VALUE);
        Node tempVowel=dummyVowel;
        
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data=='a'|| temp.data=='e' || temp.data=='i' || temp.data=='o' || temp.data=='u'){
               tempVowel.next=temp;
               tempVowel=tempVowel.next;
               temp=temp.next;
               
            }
            else{
                tempConsonants.next=temp;
                tempConsonants=tempConsonants.next;
                temp=temp.next;
            }
        }
        tempVowel.next=null;
        tempConsonants.next=null;
        tempVowel.next=dummyConsonants.next;
        return dummyVowel.next;
        
    }
}
