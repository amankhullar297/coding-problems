/*
Problem : Given an array of n integers. Sort it using selection sort.

Approach : 1. Iterate over whole n integers and find minimum integer. Swap it with current(i.e 0) index.
2. For first iteration we will get smallest element at the 0 index of the array.
3. Follow Step 1 for n times.
4. We will get all the integers in sorted order.

Input : [9 , 5, 2, 1]

Output : [1, 2, 5, 9]

Explanation : By Following above approach :-
On 1st iteration : [5, 2, 1, 9]
On 2nd iteration : [1, 2, 5, 9]

Time Complexity : O(n^2)
Space Complexity : o(1)

Note: Selection sort wins over Bubble sort only in less number of swaps.
*/

package Sorting;

public class SelectionSort {
    public void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            swap(arr, i, minIndex);
        }
    }

    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}