/*
Given a min heap and an integer element. You need to insert that element in the heap such that it should follow the properties
of the heap.

Approach:
1. Increment the size of the heap and add the element to be added at the end.
3. Now since last element added affects the property of the heap.
4. Heapify the heap from bottom to top till root element comes in it's perfect position.
5. In heapify check if parent is greater than element, If yes swap both.
6. Follow step 5 till parent is smaller than element or element is root.

Input: [4, 7, 10, 8, 9, 6] and element: 1

Output: [1, 4, 7, 10, 8, 9, 6]

Time Complexity: 0(log n)
*/

package Heap;

public class Insertion {

   public int[] insertElement(int[] heap, int element){
        int[] tempHeap = new int[heap.length + 1];
        System.arraycopy(heap, 0, tempHeap, 0, heap.length);
        tempHeap[heap.length] = element;
        heap = tempHeap;

        heapify(heap);
        return heap;
    }

    private void heapify(int[] heap){
        int current = heap.length-1;
        int parent = (current - 1) / 2;
        while (heap[current] < heap[parent]) {
            swap(current, parent, heap);
            current = parent;
            parent = current / 2;
        }
    }

    private void swap(int start, int end, int[] heap) {
        int temp = heap[start];
        heap[start] = heap[end];
        heap[end] = temp;
    }
}
