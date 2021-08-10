/*
Problem : Given a segment tree. Update the value in segment tree for given index.

Approach : 1. Calculate the difference of the previous and current value for given index.
           2. Add that difference value to the sum ranges.

Time Complexity : O(log n)
*/

package SegmentTree;

public class UpdateInRange {
    SegmentTree tree;

    public UpdateInRange(int[] arr){
        tree = new SegmentTree(arr);
    }

    /* A recursive function to update the nodes which have the given index in their range.
    index is the index of the element to be updated. This index is in input array.
    diff is the Value to be added to all nodes which have i in range
    initialIndex is the initial index of the segment tree.
    start & end  --> Starting and ending indexes of the segment represented by current node, i.e., tree.data[index]
   */
    void updateValueUtil(int start, int end, int index, int diff, int initialIndex)
    {
        // Base Case: If the input index lies outside the range of
        // this segment
        if (index < start || index > end)
            return;

        // If the input index is in range of this node, then update the
        // value of the node and its children
        tree.data[initialIndex] = tree.data[initialIndex] + diff;
        if (end != start) {
            int mid = getMid(start, end);
            updateValueUtil(start, mid, index, diff, 2 * initialIndex + 1);
            updateValueUtil(mid + 1, end, index, diff, 2 * initialIndex + 2);
        }
    }

    private int getMid(int s, int e) {
        return s + (e - s) / 2;
    }
}
