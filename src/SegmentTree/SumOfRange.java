/*
Problem : Given a segment tree. Return the sum of elements from l to r.

Approach : 1. Check if the range of the node is completely between l and r. If yes, then return the sum.
           2. Check if range is completely outside the range from l and r. If yes, return 0.
           3. Else check the same for node's left and right to get overlap ranges sum.

Input : [1, 3, 5, 7, 9, 11]
        queryStart = 1
        queryEnd = 3


                             36
                           [ 0-5 ]
                          /       \
                         9        27
                       [0-2]     [3-5]
                      /    \     /   \
                     4      5   16    11
                   [0-1]       [3-4]
                  /     \      /   \
                 1       3    7     9

Output : 15

Time Complexity : O(log n)
*/

package SegmentTree;

public class SumOfRange {
    SegmentTree tree;

    public SumOfRange(int[] arr){
        tree = new SegmentTree(arr);
    }

    int getSum(int n, int queryStart, int queryEnd)
    {
        // Check for erroneous input values
        if (queryStart < 0 || queryEnd > n - 1 || queryStart > queryEnd) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0, n - 1, queryStart, queryEnd, 0);
    }

    /*
       A recursive function to get the sum of values in given range
       of the array.  The following are parameters for this function.

      index denotes the Index of current node in the segment tree. Initially 0 is passed as root is always at index 0
      start & end  --> Starting and ending indexes of the segment represented by current node, i.e., tree.data[index]
      queryStart & queryEnd  --> Starting and ending indexes of query range
      */
    private int getSumUtil(int start, int end, int queryStart, int queryEnd, int index)
    {
        // If segment of this node is a part of given range, then return
        // the sum of the segment
        if (queryStart <= start && queryEnd >= end)
            return tree.data[index];

        // If segment of this node is outside the given range
        if (end < queryStart || start > queryEnd)
            return 0;

        // If a part of this segment overlaps with the given range
        int mid = getMid(start, end);
        return getSumUtil(start, mid, queryStart, queryEnd, 2 * index + 1) +
                getSumUtil(mid + 1, end, queryStart, queryEnd, 2 * index + 2);
    }

    private int getMid(int start, int end) {
        return start + (end - start) / 2;
    }
}