package LinkedList;

public class FindNode {
	Node head;
	 public void insert(int new_data)
	    {
	        
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	 public int nthNode(Node head,int n){
		 Node temp=head;
		 temp=temp.next;
		 int count=1;
		 if(count==n){
			 return temp.data;
		 }
			 else {
				 return nthNode(temp, n-1);
			 }
		 }
	 

	public static void main(String[] args) {
FindNode ll=new FindNode();
		ll.insert(15);
		ll.insert(25);
		ll.insert(35);
		ll.insert(45);
		ll.insert(55);
		ll.insert(65);
		System.out.println(ll.nthNode(ll.head, 4));

	}

}
