/*
Given two strings ‘X’ and ‘Y’, return the minimum number of insertion and deletion on string X to convert it to string Y.

Approach: Calculate the length of longest common sub-sequence and subtract it from string x length to get no. of deletions and y
to get no. of insertions.

Input:
    x = "heap"
    y = "pea"

Output: [1, 2]

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.CommonSubSequence;

public class MinimumInsertionAndDeletion {
    public int[] getMinimumInsertionAndDeletion(String x, String y){
        int longestCommonSequence  = new CommonSubSequenceProblem().commonSubsequenceTopDown(x, y);
        return new int[]{y.length() - longestCommonSequence, x.length()-longestCommonSequence};
    }
}
