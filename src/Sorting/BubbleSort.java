/*
Problem : Given an array of n integers. Sort it using bubble sort.

Approach : 1. Take two integer from beginning, if second is smaller than first swap them. Do this until we reach last integer.
2. For first iteration we will get greatest element at the end of the array.
3. Follow Step 1 for n times.
4. We will get all the integers in sorted order.

Input : [9 , 5, 2, 1]

Output : [1, 2, 5, 9]

Explanation : By Following above approach :-
On 1st iteration : [5, 2, 1, 9]
On 2nd iteration : [2, 1, 5, 9]
On 3rd iteration : [1, 2, 5, 9]

Time Complexity : O(n^2)
Space Complexity : o(1)
*/

package Sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr)
    {
        for(int i=0; i < arr.length; i++)
        {
            for(int j=0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}