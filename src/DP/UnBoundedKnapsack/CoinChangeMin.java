/*
Given an array of changes and amount n. Return the minimum ways we can change n from given amounts in array. We can use particular amount from array
as many times as possible.

Input:
    value = [ 1, 2, 3]
    n = 4

Output: 2

Time Complexity: 0(n * value.length)

Space Complexity: 0(n)
*/

package DP.UnBoundedKnapsack;

public class CoinChangeMin {
    public static void main(String[] args) {
        CoinChangeMin cm = new CoinChangeMin();
        System.out.println(cm.minElementOfCoinChange(new int[]{9, 6, 5, 1}, 11));
    }

    public int minElementOfCoinChange(int[] coins, int n){
        int[] dp = new int[n+1];

        for(int i = 1; i < n+1; i++)
            dp[i] = Integer.MAX_VALUE;

        for (int i = 1; i < coins.length+1; i++)
        {
            for (int j = 1; j < n+1; j++)
            {
                if (coins[i-1] <= j && dp[j - coins[i-1]] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j - coins[i-1]]+1, dp[j]);
            }
        }

        return dp[n];
    }
}
