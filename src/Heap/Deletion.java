/*
Given min heap in the form of array. You have to delete the minimum element from the heap.
Note: In min heap the minimum element is present at the root(0th index) of the heap.

Approach:
1. Swap the element at root(0th index) with the last element of the heap.
2. Delete the last element of the heap by decrementing the size by 1.
3. Now since last element is present at root of heap affecting the property of heap.
4. Now heapify the heap till root element comes in it's perfect position.
5. In heapify check if left child is smaller than root, If yes swap both, else check for right and do the same.
6. Follow step 5 till root of sub-tree is neither greater than left nor right child.

Input: [1, 4, 7, 6,	9, 10, 8]

Output: [4, 6, 7, 8, 9, 10, 1]

Time Complexity: 0(log n)
*/

package Heap;

public class Deletion {

    public int deleteMinimumElement(int[] heap) {
        int elementToDelete = heap[0];
        swap(0, heap.length-1, heap);
        heapify(heap, heap.length-1, 0);

        return elementToDelete;
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
