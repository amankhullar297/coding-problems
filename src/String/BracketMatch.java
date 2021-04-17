/*

Problem : A string of brackets is considered correctly matched if every opening bracket in the string can
be paired up with a later closing bracket, and vice versa. For instance, “(())()” is correctly matched,
whereas “)(“ and “((” aren’t. For instance, “((” could become correctly matched by adding two closing brackets at the end, so you’d return 2.

Given a string that consists of brackets, write a function bracketMatch that takes a bracket string as an input and
returns the minimum number of brackets you’d need to add to the input in order to make it correctly matched.

Input1 : “(()”
Output : 1

Input2 : “(())”
Output : 0

Approach : Traverse each character of string and check if character is opening bracket push it in stack and increment count,
 if it's closing bracket then pop it. Also check if character is closing bracket then increment count; At last return count.

*/

package Pramp.BracketMatch;

import java.util.Stack;

public class BracketMatch {
    static int bracketMatch(String text) {
        Stack<Character> stack = new Stack<Character>();
        int count  = 0;
        for(int i=0; i<text.length(); i++)
        {
            if(text.charAt(i) == '(')
            {
                stack.push(text.charAt(i));
                count ++;
            }

            else if(text.charAt(i) == ')')
            {
                if(stack.isEmpty())
                    count++;
                else
                {
                    stack.pop();
                    count --;
                }
            }
        }

        return count;
    }
}
