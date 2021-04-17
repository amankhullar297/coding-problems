/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Input: n = 16

Output: true

Explanation: 24 = 16

Link : https://leetcode.com/problems/power-of-two/
*/

package BitManipulation;

public class IsPowerOfTwo {

    /*
    Approach - 1 : Using Modulus and RightShift operator
    Explanation : Check whether number is divisible by 2. If yes then right-shift it's bit by 1 till it's not equal to 1.
                   If it's not divisible by 2 then return false;
    Time-complexity : 0(logn)
    Space-complexity : 0(1)
     */

    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;

        while (n != 1)
        {
            if(n % 2 != 0)
                return false;

            n >>= 1;
        }

        return true;
    }
}
