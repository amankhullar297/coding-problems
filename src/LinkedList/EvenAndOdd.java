package LinkedList;

public class EvenAndOdd {
	LinkedList list;
	
	public void evenAndOdd(){
		Node prev;
	Node curr=this.list.head;
	Node end=curr;
	while(end!=null){
		end=end.next;
	}
	while(curr!=null && curr.data%2==0){
		curr=curr.next;
	}
	this.list.head=curr;
	curr=this.list.head;
	prev=curr;
	while(curr!=null){
		if(curr.next.data%2==0){
		  end.next=curr;
		  end=curr;
		 // curr.next.next;
			
			
		}
		else{
			curr=curr.next;
		}
	}
	}

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(14);
		ll.insert(22);
		ll.insert(19);
		ll.insert(18);
		ll.insert(24);
		ll.insert(65);
		EvenAndOdd eae=new EvenAndOdd();
		eae.list=ll;
		System.out.println(eae.list);
		eae.evenAndOdd();
		System.out.println(eae.list);

	}

}
