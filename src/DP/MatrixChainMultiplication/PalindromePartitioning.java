/*
Given a string, a partitioning of the string is a palindrome partitioning if every substring of the partition is a palindrome.
For example, “aba|b|bbabb|a|b|aba” is a palindrome partitioning of “ababbbabbababa”.
Determine the fewest cuts needed for a palindrome partitioning of a given string.
For example, minimum of 3 cuts are needed for “ababbbabbababa”. The three cuts are “a|babbbab|b|ababa”.
If a string is a palindrome, then minimum 0 cuts are needed.

Input:
    s: "nitik"

Output: 2 (n|iti|k)

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.MatrixChainMultiplication;

import java.util.Arrays;

public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(new PalindromePartitioning().minimumPalindromePartitionsOptimized("nitik"));
    }

    public int minimumPalindromePartitions(String s){
        return minimumPalindromePartitionsUtil(s, 0, s.length()-1);
    }

    private int minimumPalindromePartitionsUtil(String s, int i, int j){
        if(i >= j)
            return 0;

        if(isPalindrome(s.substring(i,j+1)))
            return 0;

        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int temp = minimumPalindromePartitionsUtil(s, i, k) + minimumPalindromePartitionsUtil(s, k+1, j) + 1;
            min = Math.min(min, temp);
        }

        return min;
    }

    private boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public int minimumPalindromePartitionsMemoized(String s){
        int[][] dp = new int[s.length()][s.length()];

        for(int[] a : dp)
            Arrays.fill(a, -1);

        return minimumPalindromePartitionsMemoizedUtil(s, 0, s.length()-1, dp);
    }

    private int minimumPalindromePartitionsMemoizedUtil(String s, int i, int j, int[][] dp){
        if(i >= j)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        if(isPalindrome(s.substring(i,j+1)))
            return 0;

        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int temp = minimumPalindromePartitionsMemoizedUtil(s, i, k, dp) + minimumPalindromePartitionsMemoizedUtil(s, k+1, j, dp) + 1;
            min = Math.min(min, temp);
        }

        dp[i][j] = min;
        return min;
    }

    public int minimumPalindromePartitionsOptimized(String s){
        int[][] dp = new int[s.length()][s.length()];

        for(int[] a : dp)
            Arrays.fill(a, -1);

        return minimumPalindromePartitionsOptimizedUtil(s, 0, s.length()-1, dp);
    }

    private int minimumPalindromePartitionsOptimizedUtil(String s, int i, int j, int[][] dp){
        if(i >= j)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        if(isPalindrome(s.substring(i,j+1)))
            return 0;

        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            int left = 0;
            if(dp[i][k] != -1)
                left = dp[i][k];
            else{
                left = minimumPalindromePartitionsMemoizedUtil(s, i, k, dp);
                dp[i][k] = left;
            }

            int right = 0;
            if(dp[k+1][j] != -1)
                right = dp[k+1][j];
            else{
                right = minimumPalindromePartitionsMemoizedUtil(s, k+1, j, dp);
                dp[k+1][j] = right;
            }

            min = Math.min(min, left + right + 1);
        }

        dp[i][j] = min;
        return min;
    }
}
