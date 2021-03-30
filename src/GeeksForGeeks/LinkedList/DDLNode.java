package LinkedList;

public class DDLNode {
	private int data;
	private DDLNode prev;
	private DDLNode next;
	
	

	public DDLNode(int data) {
		super();
		this.data = data;
	}



	public DDLNode(int data, DDLNode prev, DDLNode next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}



	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public DDLNode getPrev() {
		return prev;
	}



	public void setPrev(DDLNode prev) {
		this.prev = prev;
	}



	public DDLNode getNext() {
		return next;
	}



	public void setNext(DDLNode next) {
		this.next = next;
	}



	@Override
	public String toString() {
		return "DDLNode [data=" + data + "]";
	}



	
	

}
