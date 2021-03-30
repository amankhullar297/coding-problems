package LinkedList;

//import java.util.LinkedList;

public class LinkedNode {
	private LinkedNode next;
	private int data;
	
	
	
	

	public LinkedNode(int data) {
		super();
		this.data = data;
	}



	public LinkedNode getNext() {
		return next;
	}



	public void setNext(LinkedNode next) {
		this.next = next;
	}



	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "LinkedNode [data=" + data + ", getNext()=" + getNext()  + "]";
	}



	public static void main(String[] args) {
	LinkedNode l1=new LinkedNode(15);
	LinkedNode l2=new LinkedNode(25);
	LinkedNode l3=new LinkedNode(35);
	l3.setNext(l2);
	l2.setNext(l1);
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l3);
	

	}

}
