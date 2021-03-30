/*
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.

Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4

Link : https://www.interviewbit.com/problems/repeat-and-missing-number-array
 */

package InterviewBit.BitManipulation;

public class RepeatAndMissingNumber {

    /*
    Approach - 1 : Brute-Force Approach
    Explanation : Traverse all array elememts for 1 to n integer and check if count == 2 then number is repeating.
                  And if count == 0 then number is missing.
    Time-complexity : 0(n^2)
    Space-complexity : 0(1)
     */

    public int[] repeatedNumber(final int[] A) {
        int[] ans = new int[2];
        for(int i=1; i<=A.length;i++)
        {
            int count = 0;
            for(int j=0; j<A.length; j++)
            {
                if(A[j] == i)
                    count++;

                if(count >= 2)
                    ans[0] = A[j];
            }
            if(count == 0)
                ans[1] = i;
        }

        return ans;
    }

    /*
    Approach - 2 : Sorting
    Explanation : Sort the array and traverse through the array. If two adjacent elements are elements then they are
                   repeated element and if index number and array element is not same then that is missing element.
    Time-complexity : 0(nlogn)
    Space-complexity : 0(1)
     */

    public int[] repeatedNumber(final int[] A) {
        int[] ans = new int[2];
        Arrays.sort(A);
        for(int i=0; i<A.length-1; i++)
        {
            if(A[i] != i+1)
                ans[1] = i;

            if(A[i] == A[i+1])
                ans[0] = A[i];
        }

        return ans;
    }

    /*
    Approach - 3 : Using count array.
    Explanation : Traverse through the array and keep track of element count at secondary index. And then check element
                   with count 2 is repeated element and with count 0 is missing element;
    Time-complexity : 0(n)
    Space-complexity : 0(n)
     */

    public int[] repeatedNumber(final int[] A) {
        int[] ans = new int[2];
        int[] arr = new int[A.length+1];

        for(int i=0; i<A.length; i++)
        {
            arr[A[i]]++;
        }

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] == 2)
                ans[0] = i;

            if(arr[i] == 0)
                ans[1] = i;
        }
        return ans;
    }

     /*
    Approach - 4 : Using X-OR operator.
    Explanation : Traverse through the array and xor elements. Then xor result with elements from 1 to n .
                   We will get value with of MissingElement ^ RepeatedElement.
                   Now compute element with right-most bit as 1 from above value;
                   Then find xor of elements 1 to n and array with right-most bit same as 1.
                   Then find xor of elements 1 to n and array with right-most bit not same as 1.
                   The values found are repeated and missing elements.

    Time-complexity : 0(n)
    Space-complexity : 0(1)
     */

    public int[] repeatedNumber(final int[] A) {
        int x = 0, y = 0;
        int xor = A[0];
        for(int i=1; i<A.length; i++)
            xor ^= A[i];

        for(int i=1; i<=A.length; i++)
            xor ^= i;

        int value = xor & ~(xor - 1);

        for(int i=0; i<A.length; i++)
        {
            if((A[i] & value) != 0)
                x ^= A[i];

            else
                y ^= A[i];
        }

        for(int i=1; i<=A.length; i++)
        {
            if((i & value) != 0)
                x ^= i;

            else
                y ^= i;
        }

        return new int[]{y, x};
    }
}
