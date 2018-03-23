package aman.ds.stack;

class StackNode{
	int data;
	StackNode next;
	
	public StackNode(int data){
		this.data=data;
		
	}
	
}

class Stack{
	StackNode top;
	
	public void push(int data){
		if(top==null){
			top=new StackNode(data);
			return;
		}
		StackNode s=new StackNode(data);
		s.next=top;
		top=s;
	}
	public int pop(){
		int data=top.data;
		top=top.next;
		top.next=null;
		return data;
		
		
	}
	 public void display()
	    {
	        StackNode s = this.top;
	        while (s != null) {
	            System.out.print(" " + s.data);
	            s = s.next;
	        }
	        System.out.println();
	    }
	 public void reverse(){
		 StackNode prev,curr,succ;
		 prev=curr=top;
		 curr=curr.next;
		 prev.next=null;
		 while(curr!=null){
			 succ=curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=succ;
		 }
		top=prev; 
		 
	 }
}

public class RevLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack s=new Stack();
       s.push(9);
       s.push(5);
       s.display();
       s.reverse();
       s.display();
	}

}
