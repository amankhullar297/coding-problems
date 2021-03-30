package LinkedList;

public class SplitList {
	 LinkedList temp1=new LinkedList();
	 LinkedList temp2=new LinkedList();
	public void splitList(LinkedList a){
		Node temp=a.head;
		int count=0;
		while(temp!=null){
		if(count%2==0){
			temp1.insert(temp.data);
			temp=temp.next;
			count++;
		}
		else{
			temp2.insert(temp.data);
			temp=temp.next;
			count++;
		}
		}
		
	}

	@Override
	public String toString() {
		return "SplitList [temp1=" + temp1 + ", temp2=" + temp2 + "]";
	}

	public static void main(String[] args) {
		SplitList sl=new SplitList();
		LinkedList l1=new LinkedList();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		sl.splitList(l1);
		System.out.println(sl);

	}

}
