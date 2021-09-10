/*
Given an array of n integers and an integer sum. Count the number of subset that can be formed with given sum.

Approach: Apply Dp by calculating count of subset by selecting a item and not selecting that iem.

Input:
    value = [2, 3, 5, 6, 8, 10]
    sum = 10

Output: 3

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)

*/

package DP.BoundedKnapsack;

public class CountSubsetSum {
    public int subsetWithGivenSum(int[] A, int sum){
        int[][] dp = new int[A.length+1][sum+1];

        for(int i = 0; i < A.length+1; i++)
            dp[i][0] = 1;

        for(int i = 1; i<A.length+1; i++){
            for(int j = 1; j<sum+1; j++){

                if(A[i-1] <= j)
                    dp[i][j] = dp[i-1][j - A[i-1]] + dp[i-1][j];

                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[A.length][sum];
    }
}
