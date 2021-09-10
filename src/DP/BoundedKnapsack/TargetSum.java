/*
Given an array of n integers and an integer sum. You need to add either + or - sign with each element such that
sum is equal to given sum;

Approach: 1. Suppose for below input you make combination as -1 +1 -2 +3. So sum is 1.
          2. When we break it into subsets it can be written as [1, 3] and [-1, -2].
          3. It's equal to [1, 3] - [1, 2]
          4. We can generalize ques as find the subsets whose difference is equal to given sum.
          5. We have solved this earlier.

Input:
    value = [1, 1, 2, 3]
    sum = 1

Output: 3

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.BoundedKnapsack;

public class TargetSum {
    public int elementsWithGivenSUm(int[] A, int sum){
        return new SubsetsWithDifference().subsetsWithGivenDifference(A, sum);
    }
}
