package LinkedList;

public class CircularLinkedList {
Node front=null;
Node end=null;
public void insert(int data){
	if(front==null){
		front=new Node(data);
		end=front;
	}
		else{
		Node temp=front;
		System.out.println("loop begins");
		while(!temp.equals(end)){
			temp=temp.next;
		}
		Node current=new Node(data);
		temp.next=current;
		current.next=front;
		end=current;
		
		}
	}



	@Override
public String toString() {
		Node temp=this.front;
		String result="[";
	while(!temp.equals(end)){
		result=result+temp.data+" ";
		temp=temp.next;
	}
	return result+end.data+"]";
}



	public static void main(String[] args) {
	CircularLinkedList cl=new CircularLinkedList();
	cl.insert(15);
	cl.insert(5);
	cl.insert(26);
	cl.insert(55);
	System.out.println(cl);

	}

}
