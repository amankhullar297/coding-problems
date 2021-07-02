/*
Given an array of elements n, construct min heap from elements given in array.

Approach:
1. Create an array of size n.
2. Store second half of the elements in the array acting as leaves of the heap.
3. Now add each element of first half one by one and heapify from element towards leaves.
4. In heapify, check if left or right leaf of the node inserted is smaller than node or not. If yes, swap both.
5. Swap sub-tree until above condition is not met or node become leaf.

Input : [4, 9, 7, 6, 8, 1, 2, 5, 3]

Output: [1, 3, 2, 5, 8, 7, 4, 9, 6]

             1
           /   \
          3     2
         / \   / \
        5   8 7   4
       / \
      9   6

Time Complexity: 0(n)
Link for time complexity explanation: https://www.geeksforgeeks.org/time-complexity-of-building-a-heap/
*/


package Heap;

public class HeapConstruction {

    public int[] constructHeap(int[] arr){
        int[] heap = new int[arr.length];
        int mid = arr.length / 2;
        System.arraycopy(arr, mid, heap, mid, arr.length - mid);

        for(int i = mid-1; i >= 0; i--){
            heap[i] = arr[i];

            heapify(heap, arr.length, i);
        }

        return heap;
    }

    private void swap(int start, int end, int[] heap) {
        int temp = heap[start];
        heap[start] = heap[end];
        heap[end] = temp;
    }

    private void heapify(int heap[], int n, int i) {
        int index = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && heap[l] < heap[index])
            index = l;

        if (r < n && heap[r] < heap[index])
            index = r;

        if (index != i) {
            swap(index, i, heap);
            heapify(heap, n, index);
        }
    }
}