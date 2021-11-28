/*
Given an array of changes and amount n. In how many ways we can change n from given amounts in array. We can use particular amount from array
as many times as possible.

Approach: Apply dp and calculate the count for particular value of n by selecting a amount and not selecting particular amount.

Input:
    value = [ 1, 2, 3]
    n = 4

Output: 4

Time Complexity: 0(n * value.length)

Space Complexity: 0(n)
*/

package DP.UnBoundedKnapsack;

public class CoinChangeCount {
    public int coinChangeCount(int[] coins, int n){
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i = 1; i < coins.length+1; i++){
            for(int j = 1; j < n+1; j++){
                if(coins[i-1] <= j)
                    dp[j] = dp[j] + dp[j - coins[i-1]];
            }
        }

        return dp[n];
    }
}
