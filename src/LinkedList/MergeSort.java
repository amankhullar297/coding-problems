package LinkedList;

public class MergeSort {
	public Node getMiddle(LinkedList list){
		Node slow=list.head;
		Node fast=list.head.next.next;
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
