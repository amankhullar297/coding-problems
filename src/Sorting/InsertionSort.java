/*
Problem : Given an array of n integers. Sort it using insertion sort.

Approach : 1. Start for i=1 and move till 0. While iterating check if previous integer is greater than current integer. Swap them.
2. For first iteration we will get smallest element at the index 0 of the array.
3. Follow Step 1 till i=n.
4. We will get all the integers in sorted order.

Input : [9 , 5, 2, 1]

Output : [1, 2, 5, 9]

Explanation : By Following above approach :-
On 1st iteration : [5 , 9, 2, 1]
On 2nd iteration : [5 , 9, 2, 1]
On 3rd iteration : [2, 5, 9, 1]
On 4th iteration : [1, 2, 5, 9

Time Complexity : O(n^2)
Space Complexity : o(1)
*/

package Sorting;

public class InsertionSort {
    public void insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int j = i-1;
            int key = arr[i];

            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
}
