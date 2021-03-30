package LinkedList;

public class DelLesserNode {
	LinkedList list;
	public void delLesserNode(){
		Node prev=null;
		Node curr=this.list.head;
		Node next=curr.next;
		while(curr.data<next.data){
			prev=curr;
			curr=curr.next;
			next=curr.next;
		}
		this.list.head=curr;
		while(next!=null){
			if(curr.data<next.data){
				Node temp=curr;
				 prev=next;
				curr=prev.next;
				next=curr.next;
				temp.next=null;
			}
			else{
				curr=curr.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(15);
		ll.insert(25);
		ll.insert(19);
		ll.insert(15);
		ll.insert(24);
		ll.insert(65);
		DelLesserNode dl=new DelLesserNode();
		dl.list=ll;
		System.out.println(dl.list);
		dl.delLesserNode();
		System.out.println(dl.list);

	}

}