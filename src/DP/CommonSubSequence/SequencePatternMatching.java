/*
Given two strings ‘X’ and ‘Y’, check whether X can be any of subsequence of Y.

Approach: Computer the length of common subsequence of X and Y. If common subsequence length is equal to the length
 of the string X, then x can be formed from Y, else not.

Input:
    x = "axy"
    y = "adxcpy"

Output: true

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class SequencePatternMatching {
    public boolean isStringExists(String x, String y){
        int lcs = new CommonSubSequenceProblem().commonSubsequenceTopDown(x, y);

        if(lcs == x.length())
            return true;

        return false;
    }
}
