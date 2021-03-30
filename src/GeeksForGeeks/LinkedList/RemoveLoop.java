package LinkedList;

import java.util.HashSet;

public class RemoveLoop {
	LinkedList list;
	public void removeLoop(){
		Node curr=this.list.head;
		   HashSet<Node> s = new HashSet<Node>();
	        while (curr != null)
	        {
	             // If we have already has this node
	             // in hashmap it means their is a cycle
	             // (Because you we encountering the
	             // node second time).
	            if (s.contains(curr))
	            {
	            	curr.next=null;
	            	break;
	            }
	              //  return true;
	   
	            // If we are seeing the node for
	            // the first time, insert it in hash
	            s.add(curr);
	   
	            curr= curr.next;
	        }
	   
	        //return false;
	}
	public static void main(String[] args) {
	RemoveLoop rl=new RemoveLoop();
		LinkedList ll=new LinkedList();
		ll.insert(14);
		ll.insert(22);
		ll.insert(19);
		ll.insert(18);
		ll.insert(24);
		ll.insert(65);
		ll.head.next.next=ll.head.next.next.next.next;
		rl.removeLoop();
		System.out.println(rl.list);
	}

}
