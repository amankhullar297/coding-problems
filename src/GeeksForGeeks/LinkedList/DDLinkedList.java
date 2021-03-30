//No output
package LinkedList;

 public class DDLinkedList {
	private DDLNode head;
	private DDLNode tail;
	private int length;
	
	public DDLinkedList(){
		
			/*head=new DDLNode(Integer.MIN_VALUE);
			tail=head;
			length=0;*/
	}
	 public void insertAtBegening(int data){
		 if(head==null){
			 head=new DDLNode(data); 
			 tail=head;
			 length++;
		 }
		 else{
			 DDLNode temp=new DDLNode(data);
			 temp.setPrev(null);
			 temp.setNext(head.getPrev());
			 length++;
		 }
	 }
	 public void insert(int data){
		 if(head==null){
			 head=new DDLNode(data); 
			 tail=head;
			 length++;
		 }
		 else{
			 DDLNode temp=new DDLNode(data);
			 tail.setNext(temp.getPrev());
			temp.setPrev(tail.getNext());
			 temp.setNext(null);
			 tail=temp;
		
			 length++;
			 }}
	 public void insertAtEnd(int data){
		 DDLNode temp=new DDLNode(data);
		 temp.setPrev(tail.getNext());
		 temp.setPrev(null );
		 tail=temp;
		 length++;
	 }
	 

	@Override
	public String toString() {
		String list="[";
		DDLNode temp=head;
    while (temp!=null) {
		list=list+temp+",";
		temp=temp.getNext();
		}
    list=list+"]";
    return list;
	}
	public static void main(String[] args) {
		DDLinkedList dd=new DDLinkedList();
		dd.insert(15);
		dd.insert(20);
		dd.insert(25);
		dd.insertAtBegening(30);
		dd.insertAtEnd(55);
		System.out.println(dd);
		System.out.println(dd.length);

	}

}
