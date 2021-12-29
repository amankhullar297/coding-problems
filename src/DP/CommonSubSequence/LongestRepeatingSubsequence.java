/*
Given string ‘X’, find the length of the longest repeating sequence in that string.

Approach: Find LCS of X with X such that, increment count if character are equal and their indexes are not same.

Input:
    x = "aabebcdd"

Output: 3

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class LongestRepeatingSubsequence {
    public int longestRepeatingSubsequence(String x){
        int[][] dp = new int[x.length()+1][x.length()+1];

        for(int i = 1; i <= x.length(); i++){
            for(int j = 1; j <= x.length(); j++){
                if(x.charAt(i-1) == x.charAt(j-1) && i != j)
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[x.length()][x.length()];
    }
}
