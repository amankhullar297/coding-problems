package LinkedList;

//import java.util.LinkedList;

public class LinkesList {
private int length;
LinkedNode head=new LinkedNode(0);
 class InvalidPositionException extends Exception{}

public void insertAtBegining(LinkedNode node){
	node.setNext(head);
	head=node;
	length++;
}
public void insertAtEnd(LinkedNode node){
	LinkedNode temp=head;
	while(temp.getNext()!=null){
		temp=temp.getNext();
	}
	temp.setNext(node);
	node.setNext(null);
	length++;
}
public void insertAtMiddle(int position,LinkedNode node) throws Exception{
	if(position<length || position>length){
		throw new InvalidPositionException();
	}
	LinkedNode temp;
	temp=head;
	for(int i=0;i<position;i++){
		temp=temp.getNext();
		}
	node.setNext(temp.getNext());
	temp.setNext(node);
	
}

@Override
public String toString() {
	return " ["   +"]";
}
public static void main(String a[]){
	LinkesList ll=new LinkesList();
	LinkedNode l1=new LinkedNode(5);
	LinkedNode l2=new LinkedNode(25);
	LinkedNode l3=new LinkedNode(95);
	ll.insertAtEnd(l3);
	ll.insertAtBegining(l1);
	ll.insertAtEnd(l3);

}
}