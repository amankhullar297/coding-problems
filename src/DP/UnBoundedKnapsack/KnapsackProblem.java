/*
Given items of size N. Given weight array denoting the weight of each item and value array denoting cost of each item.
Given an integer value 'w' that denotes the maximum weight of the bag. You have to fill the big with items with given weight and maximum cost.
Note: We can use same item as number of times possible.

Approach: Apply Dp by calculating max of cost by selecting a item and not selecting that item.

Input:
    weights = [5, 10, 15]
    value = [10, 30, 20]
    weight = 100

Output: 300

Time Complexity: 0(n * weight)

Space Complexity: 0(n)
*/

package DP.UnBoundedKnapsack;

public class KnapsackProblem {
    public int maxCost(int[] weight, int[] value, int n, int w){
        int[] dp = new int[w+1];

        for(int  i = 1; i < n+1; i++){
            for(int j = 1; j< w+1; j++) {
                if (weight[i - 1] <= j)
                    dp[j] = Math.max(value[i - 1] + dp[j - weight[i-1]], dp[j]);
            }
        }

        return dp[w];
    }
}
