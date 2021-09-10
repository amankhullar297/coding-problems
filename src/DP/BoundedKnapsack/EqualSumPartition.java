/*
Given an array of n integers. Return whether array can be divided into two partition such that their sum are equal.

Approach: 1. Calculate the sum of the array.
          2. If sum is odd then array cannot be partitioned.
          3. If sum is even, then check whether there present a subset with sum/2.
          4. If yes, then array can be partitioned into two subsets with equal sum.

Input:
    value = [5, 1, 11 ,5]

Output: true

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.BoundedKnapsack;

public class EqualSumPartition {
    public boolean canEquallyPartitioned(int[] A){
        SubsetSum subsetSum = new SubsetSum();
        int sum = 0;
        for(int i : A)
            sum += i;

        if(sum % 2 == 1)
            return false;
        else
            return subsetSum.subsetWithGivenSum(A, sum/2);
    }
}