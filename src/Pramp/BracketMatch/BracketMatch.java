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
