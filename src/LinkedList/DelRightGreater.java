package LinkedList;

public class DelRightGreater {
	public static LinkedList DelRightGreater(LinkedList head){
		Node prev=head.head;
		Node current=prev.next;
		while(current!=null){
			if(current.data>prev.data){
				Node temp=current;
				prev=temp.next;
				temp=null;
				current=prev.next;
				temp=null;
			}
			else{
				prev=prev.next;
				current=current.next;
			}}
			return head;
		}
	

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(15);
		ll.insert(25);
		ll.insert(35);
		ll.insert(45);
		ll.insert(155);
		ll.insert(153);
		ll.insert(252);
		ll.insert(359);
		ll.insert(451);
		ll.insert(555);
		System.out.println(ll);
		System.out.println(DelRightGreater(ll));
		
	}

}
