package LinkedList;

public class LinkedLength {
	Node head;
	 public void insert(int new_data)
	    {
	        
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	public int findCount(Node head){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public int findRecCount(Node head){
		Node temp=head;
		if(head==null)
			return 0;
			else{
				return 1+findRecCount(temp.next);
			}
		}
	
	
	public static void main(String[] args) {
	LinkedLength ll=new LinkedLength();
	ll.insert(15);
	ll.insert(25);
	ll.insert(35);
	ll.insert(45);
	System.out.println(ll.findCount(ll.head));
	System.out.println(ll.findRecCount(ll.head));
	

	}

}
