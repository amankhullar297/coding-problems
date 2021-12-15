/*
Given string ‘X’, find the length of the longest palindromic subsequence.
Note: Palindromic is the subsequence taken from string which reads same from start or end.

Approach: Calculate then longest common subsequence of given string and reverse of that string.

Input:
    x = "agbcba"

Output: 5

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class LongestPalindromicSubSequence {
    public int getLongestPalindromicSubSequence(String x){
        String reverseString = new StringBuilder(x).reverse().toString();
        return new CommonSubSequenceProblem().commonSubsequenceTopDown(x, reverseString);
    }
}
