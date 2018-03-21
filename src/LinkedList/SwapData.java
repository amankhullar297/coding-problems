package LinkedList;
import LinkedList.LinkedLength.*;


public class SwapData {
	Node head;
	 public void insert(int new_data)
	    {
	        
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	 public void swapData(int x,int y){
		 Node prevX=null,currentX=head;
		 Node prevY=null,currentY=head;
		 while(currentX!=null){
			 if(currentX.data==x)
				 break;
			 prevX=currentX;
			 currentX=currentX.next;
		 }
		 while(currentY!=null){
			 if(currentY.data==y)
				 break;
			 prevY=currentY;
			 currentY=currentY.next;
		 }
		 prevX.next=currentY;
		 prevY.next=currentX;
		 Node temp=currentX;
		 currentX=currentY;
		 currentY=temp;
	 }
	 

	@Override
	public String toString() {
		return "SwapData [head=" + head + head.next +"]";
	}
	public static void main(String[] args) {
SwapData ll=new SwapData();
ll.insert(15);
ll.insert(25);
ll.insert(35);
ll.insert(45);
ll.insert(55);
ll.insert(65);
System.out.println(ll);
ll.swapData(35, 55);
System.out.println(ll);
	}

}
