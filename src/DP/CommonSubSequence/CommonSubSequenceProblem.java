/*
Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.

Approach: Start checking each characters. If characters matches, then increment count and check for rest characters in both
strings and if character doesnot match then compare first string by removing current character from other string and also compare other string by
removing current character from first string.

Input:
    x = "abcdmnoqr"
    y = "xyzpazbc2d"

Output: 4

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class CommonSubSequenceProblem {
    public static void main(String[] args) {
        System.out.println(new CommonSubSequenceProblem().commonSubsequenceTopDown("abcdmnoqr", "xyzpazbc2d"));
    }

    public int commonSubsequenceBottomUp(String x, String y){
        int[][] dp = new int[x.length()+1][y.length()+1];
        for(int i = 0; i < x.length()+1; i++){
            for (int j = 0; j < y.length()+1;j++){
                dp[i][j] = -1;
            }
        }
        return commonSubsequenceBottomUpUtil(x, y, x.length(), y.length(), dp);
    }

    private int commonSubsequenceBottomUpUtil(String x, String y, int i, int j, int[][] dp){
        if(i == 0 || j == 0)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        if(x.charAt(i-1) == y.charAt(j-1))
            dp[i][j] = 1 + commonSubsequenceBottomUpUtil(x, y, i-1, j-1, dp);
        else
            dp[i][j] = Math.max(commonSubsequenceBottomUpUtil(x, y, i, j-1, dp), commonSubsequenceBottomUpUtil(x, y, i-1, j, dp));

        return dp[i][j];
    }

    public int commonSubsequenceTopDown(String x, String y){
        int[][] dp = new int[x.length()+1][y.length()+1];

        for(int i = 0; i< x.length()+1; i++)
            dp[i][0] = 0;

        for(int i = 0; i< y.length()+1; i++)
            dp[0][i] = 0;

        for(int i = 1; i<x.length()+1; i++){
            for(int j = 1; j<y.length()+1; j++){
                if(x.charAt(i-1) == y.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[x.length()][y.length()];
    }
}
