/*
Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.
Note: Substring is the part of string where characters are picked in sequence manner where in subsequence characters are picked in random manner.

Approach: Start comparing each characters. If characters matches, then increment count and check for rest characters in both
strings and if character doesnot match then make count as 0 and compare first string by removing current character from other string and also compare other string by
removing current character from first string.

Input:
    x = "xyzabcdmnopq"
    y = "mnopqabcdklm"

Output: 5

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class LongestCommonSubstring {
    public int maxCommonSubstringLength(String A, String B){
        int[][] dp = new int[A.length()+1][B.length()+1];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=A.length(); i++){
            for(int j = 1; j<=B.length(); j++){
                if(A.charAt(i-1) == B.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
                else
                    dp[i][j] = 0;
            }
        }

        return max;
    }
}