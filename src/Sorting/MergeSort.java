/*
Problem : Given an array of n integers. Sort it using merge sort.

Approach : Merge sort is an application of divide and conquer technique.
1. Keep dividing the array into two parts until single elements are left.
2. Then merge every parts of array in sorted order.
3. At last resulted array left will be in sorted order.

Input : [9 , 5, 2, 1]

Output : [1, 2, 5, 9]

Explanation :

        Step : 1            [9 , 5, 2, 1]
                                /  \
                               /    \
                          [9 , 5]  [2, 1]
                            / \      / \
                          [9] [5]  [2] [1]


        Step : 2            [9 , 5, 2, 1]
                                /  \
                               /    \
                          [5 , 9]  [1, 2]
                            / \      / \
                          [5] [9]  [1] [2]


        Step : 3            [1 , 2, 5, 9]
                                /  \
                               /    \
                          [5 , 9]  [1, 2]
                            / \      / \
                          [5] [9]  [1] [2]


Time Complexity : O(nlogn)
Space Complexity : o(n)
*/

package Sorting;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    private void sort(int[] arr, int start, int end)
    {
        if(start < end) {
            int mid = start + (end - start) / 2;

            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private void merge(int arr[], int start, int mid, int end)
    {
        int[] startArr = Arrays.copyOfRange(arr, start, mid+1);
        int[] endArr = Arrays.copyOfRange(arr, mid+1, end+1);

        int i = 0, j = 0, k = start;

        while(i < startArr.length && j < endArr.length)
        {
            if(startArr[i] < endArr[j])
                arr[k++] = startArr[i++];
            else
                arr[k++] = endArr[j++];
        }

        while(i < startArr.length)
            arr[k++] = startArr[i++];

        while(j < endArr.length)
            arr[k++] = endArr[j++];
    }
}
