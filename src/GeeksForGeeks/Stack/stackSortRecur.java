package aman.ds.stack;

import java.util.Stack;

public class stackSortRecur {

	public static void sortStack(Stack s){
		
		if(!s.isEmpty())
		{
			int temp=(Integer)s.pop();
			sortStack(s);
			insertSortedElement(s, temp);

		}
	
	}
	
public static void insertSortedElement(Stack s,int temp){
	if(s.isEmpty()||temp>(Integer)s.peek())
			{
		s.push(temp);
		return;
			}
		int a=(Integer)s.pop();
		insertSortedElement(s, temp);
		s.push(a);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s=new Stack<Integer>();
s.push(5);
s.push(2);
s.push(25);
s.push(15);
sortStack(s);
System.out.println(s);


	}

}
