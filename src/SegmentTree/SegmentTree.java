/*
Problem : Given an array. Construct segment tree to calculate sum for any range.

Approach : We start with a segment arr[0 . . . n-1]. and every time we divide the current segment into two halves(if it has not yet become a segment of length 1),
           and then call the same procedure on both halves, and for each such segment, we store the sum in the corresponding node.

Segment tree array size: Segment tree array size would be 2*N - 1, if N is the power of 2 Or  2*x – 1 where x is the smallest power of 2 greater than N.

Input : [1, 3, 5, 7, 9, 11]

Output : [36, 9, 27, 4, 5, 16, 11, 1, 3, 0, 0, 7, 9, 0, 0]

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

Time Complexity : O(n)
*/


package SegmentTree;

public class SegmentTree {
    int[] data;

    public SegmentTree(int[] arr){
        // Allocate memory for segment tree
        //Height of segment tree
        int height = (int) (Math.ceil(Math.log(arr.length) / Math.log(2)));

        //Maximum size of segment tree
        int max_size = 2 * (int) Math.pow(2, height) - 1;
        this.data = new int[max_size]; // Memory allocation

        this.constructTree( arr,0, arr.length - 1, 0);
    }

    // start and end specifies indexes to construct tree from. [start....end]
    // index specifies the index of the current node.
    private int constructTree(int[] arr, int start, int end, int index){
        // If there is one element in array, store it in current node of
        // segment tree and return
        if(start == end){
            this.data[index] = arr[start];
            return arr[start];
        }

        int mid = getMid(start, end);

        // If there are more than one elements, then recur for left and
        // right subtrees and store the sum of values in this node
        this.data[index] = constructTree(arr, start, mid, index * 2 + 1) +
                constructTree(arr, mid + 1, end, index * 2 + 2);

        return this.data[index];
    }

    //Method to calculate mid
    private int getMid(int start, int end) {
        return start + (end - start) / 2;
    }
}
