package LinkedList;
public class CircularSortedInsert {
	CircularLinkedList list;
	public void circularSortedInsert(int data){
		Node temp=this.list.front;
		Node prev=null;
		while(!temp.equals(list.end)){
			if(temp.data<data){
				prev=temp;
				 System.out.println(temp.data);
			   temp=temp.next;
			   continue;
			}
			System.out.println(temp.data+"After loop");
			Node curr=new Node(data);
			prev.next=curr;
			curr.next=temp;
			break;
		}
		if(temp.equals(list.end)){
			this.list.insert(data);
		}
	}

	public static void main(String[] args) {
	CircularLinkedList cl=new CircularLinkedList();
	CircularSortedInsert cs=new CircularSortedInsert();
	cs.list=cl;
	cl.insert(5);
	cl.insert(15);
	cl.insert(25);
	cl.insert(35);
	cl.insert(45);
	cl.insert(55);
	System.out.println(cs.list);
	cs.circularSortedInsert(39);
	System.out.println(cs.list);
}
}
