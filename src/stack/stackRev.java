package aman.ds.stack;

import java.util.Stack;

public class stackRev {
	
	public static void reverse(Stack s){
		if(s.isEmpty()){
			return;
		}
	Integer a=(Integer)s.pop();	
	reverse(s);
	reverseInsert(s,a);
	}
		public static void reverseInsert(Stack s,Integer a){
		if(s.isEmpty()){
			s.push(a);
			return;
		}
		int	b=(Integer)s.pop();
			reverseInsert(s,a);
			s.push(b);
			
		
		}	
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<Integer> s=new Stack<>();
			s.push(5);
			s.push(25);		
			s.push(53);
			s.push(15);
			System.out.println(s);
			reverse(s);
			System.out.println(s);


	}

}
