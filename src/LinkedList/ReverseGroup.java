package LinkedList;

public class ReverseGroup {
	public Node reverseGroup(Node head,int index){
		Node prev=null;
		Node current=head;
		Node next=null;
		int count=0;
		while(count<index && current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			count++;
			}
		if(next!=null){
			head.next=reverseGroup(next, index);
		}
		return prev;
		
		
	}

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(15);
		ll.insert(25);
		ll.insert(35);
		ll.insert(45);
		ll.insert(55);
		ReverseGroup rg=new ReverseGroup();
		System.out.println(rg.reverseGroup(ll.head, 2));

	}

}
