/*
Given an array of n integers and integer sum. Return whether there exists any subset in array with given sum.

Approach: Apply Dp by calculating whether subset is present by selecting a item and not selecting that iem.

Input:
    value = [2, 3, 7, 8, 10]
    sum = 11

Output: true

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.BoundedKnapsack;

public class SubsetSum {
    public boolean subsetWithGivenSum(int[] A, int sum){
        boolean[][] dp = new boolean[A.length+1][sum+1];
        for(int i = 0; i < sum+1; i++)
            dp[0][i] = false;

        for(int i = 0; i < A.length+1; i++)
            dp[i][0] = true;

        for(int i = 1; i<A.length+1; i++){
            for(int j = 1; j<sum+1; j++){

                if(A[i-1] <= j)
                    dp[i][j] = dp[i-1][j - A[i-1]] || dp[i-1][j];

                else
                    dp[i][j] = dp[i-1][j];
            }
        }

         return dp[A.length][sum];
    }
}
