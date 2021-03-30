package LinkedList;

import java.util.HashSet;

public class Intersection {
	public static LinkedList sortedIntersect(LinkedList a,LinkedList b){
		LinkedList temp=new LinkedList();
		Node temp1=a.head;
		Node temp2=b.head;
		HashSet<Object> hs=new HashSet<>();
		while(temp1!=null){
			hs.add(temp1.data);
			temp1=temp1.next;
		}
		while(temp2!=null){
			if(hs.contains(temp2.data)){
			temp.insert(temp2.data);
			return temp;	
			}
			else {
				temp.insert(temp2.data);
				temp2=temp2.next;
			}
			//return temp;
		}
		System.out.println(hs);
		return temp;
	}

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		System.out.println(l1);
		LinkedList l2=new LinkedList();
		l2.insert(95);
		l2.insert(85);
		l2.insert(35);
		l2.insert(55);
		System.out.println(l2);
		System.out.println(sortedIntersect(l1, l2));



	}

}

