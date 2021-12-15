/*
Given two strings ‘X’ and ‘Y’, find the length of the minimum string that contains both X and Y.

Approach: Calculate the length of maximum common subsequence and subtract it with the sum of both the strings.

Input:
    x = "abcde"
    y = "bdefklmn"

Output: 10

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class ShortestCommonSuperSequence {
    public int shortestCommonSuperSequence(String x, String y){
        int maxCommonSubsequence = new CommonSubSequenceProblem().commonSubsequenceTopDown(x, y);
        return x.length() + y.length() - maxCommonSubsequence;
    }
}
