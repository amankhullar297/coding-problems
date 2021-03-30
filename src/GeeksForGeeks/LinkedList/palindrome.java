package LinkedList;

public class palindrome {
	static Node temp,current;
	
	public static boolean isPalindrome(Node head){
		 temp=head;
		 current=head;
		if(temp.next==null && temp.data==current.data){
			current=current.next;
			return true;
		}
		
		else if(temp.next==null && temp.data!=current.data){
			return false;
		} else {
			temp=temp.next;
			return isPalindrome(temp);
		}
		//return false;
}

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(15);
		ll.insert(25);
		ll.insert(35);
		ll.insert(45);
		System.out.println(ll);
	    System.out.println(isPalindrome(ll.head));
	    
	}

	}