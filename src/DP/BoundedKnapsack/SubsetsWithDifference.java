/*
Given an array of n integers and an integer difference. Return the number of subsets with given difference.

Approach: 1. Calculate the sum of the array.
          2. Let sum of 1 subset is s1 and sum of other subset is s2.
          3. s1 + s2 = s, where s is the sum of array.
          4. s1 - s2 = difference
          5. s - 2s1 = difference
          6. s1 = (s + difference)/2
          7. Means you have to calculate the subsets whose sum is equal to ((s-difference) / 2).

Input:
    value = [1, 1, 2, 3]

Output: 3

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.BoundedKnapsack;

public class SubsetsWithDifference {
   public int subsetsWithGivenDifference(int[] A, int diff){
        int sum = 0;
        CountSubsetSum subsetSum = new CountSubsetSum();
        for(int a : A)
            sum += a;

        sum = (sum + diff) / 2;

        return subsetSum.subsetWithGivenSum(A, sum);
    }
}
