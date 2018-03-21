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
		// TODO Auto-generated method stub

	}

}
