package aman.ds.stack;

import java.util.Stack;

public class RevTemp {
	public static Stack reverseInsert(Stack s){
		Stack<Integer> temp=new Stack<>();
		while(!s.isEmpty()){
			Integer vtemp=(Integer)s.pop();
		while(!temp.isEmpty()&&temp.peek()>vtemp){
			s.push(temp.pop());
		}
			
		temp.push(vtemp);
		}
		return temp;
		}	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<Integer> s=new Stack<>();
			s.push(5);
			s.push(25);		
			s.push(53);
			s.push(15);
			System.out.println(s);
			s=reverseInsert(s);
			System.out.println(s);


	}	
	

}
