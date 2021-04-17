/*
Problem : Given an array of n integers. Sort it using bucket sort.

Approach : 1. Calculate min and max integers and using this calculate range(i-e (max - min) / n).
2. Create buckets equals to range.
3. Add elements over buckets using formula (( arr[i] - min ) / range).
4. Sort individual bucket.
5. Club all elements of buckets.

Input : [9 , 5, 2, 1]

Output : [1, 2, 5, 9]

Time Complexity : O(nlogn)
Space Complexity : 0(n)

Note: Selection sort wins over Bubble sort only in less number of swaps.
*/

package Sorting;

import java.util.*;

public class BucketSort {
  public void bucketSort(int[] arr)
    {
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            globalMin = Math.min(arr[i], globalMin);
            globalMax = Math.max(arr[i], globalMax);
        }

        int range = globalMax - globalMin;
        int noOfBuckets = (int)Math.ceil(Math.sqrt(arr.length));
        int bucketRange = (int) Math.ceil((double) range / noOfBuckets);

        List<Integer>[] buckets = new List[noOfBuckets];

        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int num : arr) {
            buckets[hash(num, bucketRange, noOfBuckets)].add(num);
        }

        for (List<Integer> bucket : buckets) Collections.sort(bucket);

        int idx = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[idx++] = num;
            }
        }
    }

    // A very simple hash function
    private static int hash(int num, int hashValue, int numberOfBuckets) {
        int bucketNumber = num / hashValue;
        if (bucketNumber == numberOfBuckets)
            bucketNumber--;
        return bucketNumber;
    }
}
