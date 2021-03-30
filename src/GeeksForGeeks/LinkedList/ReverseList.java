package LinkedList;

public class ReverseList {
	Node head;
	public void insert(int new_data)
    {
        
        Node new_Node = new Node(new_data);
 
        
        new_Node.next = head;
 
        
        head = new_Node;
        Node temp=head;
        while (temp!=null){
        	temp=temp.next;
        }
        head=temp;
    }
 	public Node reverseList(Node head){
		Node current=head;
		Node prev=null;
		Node temp=null;
		while(current!=null){
			current.next=temp;
			current.next=prev;
			prev=current;
			current=temp;
		}
		head=prev;
		return head;
	}

	public static void main(String[] args) {
		ReverseList ll=new ReverseList();
		ll.insert(15);
		ll.insert(25);
		ll.insert(35);
		ll.insert(45);
		ll.insert(55);
		ll.insert(65);
		System.out.println(ll.reverseList(ll.head));
	}

}
