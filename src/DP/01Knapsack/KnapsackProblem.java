/*
Given items of size N. Given weight array denoting the weight of each item and value array denoting cost of each item.
Given an integer value 'w' that denotes the maximum weight of the bag. You have to fill the big with items with given weight and maximum cost.

Approach: Apply Dp by calculating max of cost by selecting a item and not selecting that iem.

Input:
    weight : [1, 2, 4, 5]
    value : [1, 4, 5, 7]
    weight : 7

Output: 11

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)

*/

public class KnapsackProblem {

    public int maxCostBottomUp(int[] weight, int[] value, int n, int w){
        int[][] dp = new int[weight.length+1][w+1];

        for(int i = 0; i<weight.length+1; i++){
            for(int j = 0; j<w+1; j++){
                dp[i][j] = -1;
            }
        }

        return maxCostBottomUpUtil(weight, value, weight.length, w, dp);
    }

    private int maxCostBottomUpUtil(int[] weight, int[] value, int n, int w, int[][] dp){
        if(n == 0 || w == 0)
            return 0;

        if(dp[n][w] != -1)
            return dp[n][w];

        if(weight[n-1] <= w)
            dp[n][w] = Math.max(value[n-1] + maxCostBottomUpUtil(weight, value, n-1, w - weight[n-1], dp),
                    maxCostBottomUpUtil(weight, value, n-1, w , dp));

        else
            dp[n][w] = maxCostBottomUpUtil(weight, value, n-1, w , dp);

        return dp[n][w];
    }

    public int maxCostTopDown(int[] weight, int[] value, int n, int w){
        int[][] dp = new int[weight.length+1][w+1];

        for(int  i = 1; i < n+1; i++){
            for(int j = 1; j< w+1; j++) {
                if (weight[i - 1] <= j)
                    dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][w];
    }
}
