/*
Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller than n.
Determine the maximum value obtainable by cutting up the rod and selling the pieces.

Approach: Apply Dp by calculating max of cost by selecting a piece of rod of particular size and not selecting that piece of rod. We can select piece of rod
of same size multiple times to attain maximum value.

Input:
    value = [ 1, 5, 8, 9, 10, 17, 17, 20]

Output: 22

Time Complexity: 0(n^2)

Space Complexity: 0(n)
*/

package DP.UnBoundedKnapsack;

public class RodCuttingProblem {
    public int maxPriceBySellingRodPieces(int[] prices){
         int[] dp = new int[prices.length+1];

         for (int i = 1; i < prices.length+1; i++){
             int max = Integer.MIN_VALUE;
             for (int j = 1; j <= i; j++){
                max = Math.max(max, prices[j-1] + dp[i-j]);
             }

             dp[i] = max;
         }

         return dp[prices.length];
     }
}
