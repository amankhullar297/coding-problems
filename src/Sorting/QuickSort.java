/*
Problem : Given an array of n integers. Sort it using quick sort.

Approach : 1. Select any random integer from array which we name as pivot.
2. Take two pointers at start and end of array and compare if integer at start pointer is greater than end, swap them.
3. Now swap the last element with pivot and you will see that pivot has come to it's correct position.
4. Do step-1 and step-2 for left and right arrays recursively.
5. We will get sorted array.

Input : [9, 5, 2, 1, 6]

Output : [1, 2, 5, 6, 9]

Explanation : Let's take pivot as last element i.e 6 :
On 1st iteration : [1, 5, 2, 6, 9]

Now 6 has come to it's correct position
Now we divide arrays into half i.e [1, 5, 2] and [9]
Let's take pivot for first half as 2
On 2nd iteration : [1, 2, 5]
Now pivot 2 has come to it's location.
And since now above array is already sorted, so again partitioning and applying quick sort will yield same result.

So our array is : [1,2, 5, 6, 9]

Time Complexity : O(nlogn)
Space Complexity : o(1)
*/

package Sorting;

public class QuickSort {
    public void quickSort(int[] arr)
    {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end)
    {
        if(start < end)
        {
            int pivot = partition(arr, start, end);

            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];

        int i = start - 1;
        for(int j = start; j <= end - 1; j++)
        {
            if(arr[j] < pivot)
                swap(arr, ++i, j);
        }

        swap(arr, i+1, end);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}