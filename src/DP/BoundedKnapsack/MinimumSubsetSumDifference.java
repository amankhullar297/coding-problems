/*
Given an array of n integers. Return the minimum difference of the sum of two subsets of an array.

Approach: 1. Calculate the sum of the array since the sum of two subsets equals to the sum of the array.
          2. Create a dp array and calculate the sum by either including an element or not including an element.
          3. Now get all the sum for n index i.e sum containing every element.
          4. sum of 1 subset is s1 and sum of other subset is s2.
          5. Since, s1 + s2 = s , where s is the sum of array.
          6. So we have to minimize s1 - s1.
          7. s1 - s2 should be minimum
          8. And s2 can be written as s - s1
          9. Putting in step 7, we get s1 - (s - s1 ) should be minimum
          10. So, s- 2s1 should be minimum
          11. So, we have to calculate the minimum of the s - 2s1 of last row of dp array.

Input:
    value = [5, 1, 11 ,6]

Output: 1

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/


package DP.BoundedKnapsack;

public class MinimumSubsetSumDifference {
    public int minimumSubsetSumDifference(int[] A){
        int sum = 0;
        for(int a : A)
            sum += a;

        boolean[][] dp = new boolean[A.length+1][sum+1];
        for(int i = 0; i<A.length+1; i++)
                dp[0][i] = true;

        for (int i = 1; i < sum+1; i++)
            dp[0][i] = false;

        for(int i = 1; i<A.length+1; i++){
            for(int j = 1; j<sum+1; j++){

                if(A[i-1] <= j)
                    dp[i][j] = dp[i-1][j - A[i-1]] || dp[i-1][j];

                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        int diff = Integer.MAX_VALUE;

        for (int j = sum / 2; j >= 0; j--) {
            if (dp[A.length][j] == true) {
                diff = sum - 2 * j;
                break;
            }
        }
        return diff;
    }
}
