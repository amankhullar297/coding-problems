package LinkedList;

public class LinkedList {
	Node head;
	public void insert(int data){
		if(head==null){
			head=new Node(data);
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			Node current=new Node(data);
			temp.next=current;
		}
	}
	

	@Override
	public String toString() {
		Node temp=this.head;
		String result="["+temp.data;
		while(temp.next!=null){
			temp=temp.next;
			result=result+","+temp.data;
		}
		return result +"]";
	}


	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(15);
		ll.insert(25);
		ll.insert(35);
		ll.insert(45);
		System.out.println(ll);


	}

}
