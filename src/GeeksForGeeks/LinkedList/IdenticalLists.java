package LinkedList;

public class IdenticalLists {
	public static boolean identicalLists(LinkedList a,LinkedList b){
		return identicalListsRec(a.head, b.head);
	}
	public static boolean identicalListsRec(Node a,Node b){
		Node temp1=a;
		Node temp2=b;
		if(temp1.next==null && temp2.next==null){
			if(temp1.data==temp2.data){
			return true;
		}
			else{return false;}}
			else{
				temp1=temp1.next;
				temp2=temp2.next;
				return identicalListsRec(temp1, temp2);
			}
		}
	

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.insert(15);
		l2.insert(25);
		l2.insert(35);
		l2.insert(45);
		System.out.println(l2);
		System.out.println(identicalLists(l1, l2));

	}
}
