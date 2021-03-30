package LinkedList;

public class CircularQueue {
	CircularLinkedList list;
	Node front=null;
	Node rear=null;
	public Node deQueue(){
		Node temp=this.list.front;
		this.list.end.next=temp.next;
		this.list.front=temp.next;
		temp.next=null;
		front=this.list.end;
		rear=this.list.front;
		return temp;
	}
	public void enQueue(int data){
		this.list.insert(data);
		front=this.list.end;
		rear=this.list.front;
		
	}
	

	@Override
	public String toString() {
		return this.list.toString();
	}
	public static void main(String[] args) {
	CircularQueue cq=new CircularQueue();
	cq.list=new CircularLinkedList();
	cq.enQueue(15);
	cq.enQueue(25);
	cq.enQueue(35);
	cq.enQueue(45);
	cq.enQueue(55);
	cq.enQueue(45);
	System.out.println(cq);
	cq.deQueue();
	cq.deQueue();
	cq.deQueue();
	System.out.println(cq);
	System.out.println(cq.rear);
	System.out.println(cq.front);
	

	}

}
