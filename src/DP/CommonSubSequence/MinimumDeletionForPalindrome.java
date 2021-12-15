/*
Given string ‘X’, return the minimum number of deletion required to make string palindrome.

Approach: Calculate the length of longest palindromic sub-sequence and subtract it from the length of the string.

Input:
    x = "agbcba"

Output: 1

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class MinimumDeletionForPalindrome {
    public int minimumDeletionToMakeStringPalindromic(String x){
        int maxPalindromicSubsequenceLength = new LongestPalindromicSubSequence().getLongestPalindromicSubSequence(x);
        return x.length() - maxPalindromicSubsequenceLength;
    }
}
