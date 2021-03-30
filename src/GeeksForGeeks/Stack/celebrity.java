package aman.ds.stack;

//Java program to find celebrity using
//stack data structure

import java.util.Stack;

public class celebrity 
{
	// Person with 2 is celebrity
	static String MATRIX[] = {"akshay","akshay","akshay","aman"};

	// Returns true if a knows b, false otherwise
	static boolean knows(String a, String b) 
	{
		boolean res = (a.equals(b) ) ? true : false;
		return res;
	}

	// Returns -1 if celebrity is not present.
	// If present, returns id (value from 0 to n-1).
	static String findCelebrity(int n) 
	{
		Stack<String> st = new Stack<>();
		String c;

		// Step 1 :Push everybody onto stack
		for (int i = 0; i < n; i++) 
		{
			st.push(MATRIX[i]);
		}

		while (st.size() > 1) 
		{
			// Step 2 :Pop off top two persons from the 
			// stack, discard one person based on return
			// status of knows(A, B).
String a = st.pop();
String b = st.pop();

			// Step 3 : Push the remained person onto stack.
			if (knows(a, b)) 
			{
				st.push(b);
			}

			else
				st.push(a);
		}

		c = st.pop();
			return c;
		// Step 5 : Check if the last person is 
		// celebrity or not
		/*for (int i = 0; i < n; i++) 
		{
			// If any person doesn't know 'c' or 'a'
			// doesn't know any person, return -1
			if (i != c && (knows(c, i) || !knows(i, c)))
				return -1;
		}
		return c;
	}*/
	}
	// Driver program to test above methods
	public static void main(String[] args) 
	{
		int n = 4;
		String result = findCelebrity(n);
		if (result== null) 
		{
			System.out.println("No Celebrity");
		} 
		else
			System.out.println("Celebrity ID " + result);
	}
}

//This code is contributed by Rishabh Mahrsee

