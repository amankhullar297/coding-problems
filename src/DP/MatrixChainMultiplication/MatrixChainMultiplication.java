/*
Given a sequence of matrices, find the most efficient way to multiply these matrices together. The problem is not
actually to perform the multiplications, but merely to decide in which order to perform the multiplications.
For example, if we had four matrices A, B, C, and D, we would have:
(ABC)D = (AB)(CD) = A(BCD) = ....

Let's take example of ABC where A is a 10 × 30 matrix, B is a 30 × 5 matrix, and C is a 5 × 60 matrix. Then,
(AB)C = (10×30×5) + (10×5×60) = 1500 + 3000 = 4500 operations
A(BC) = (30×5×60) + (10×30×60) = 9000 + 18000 = 27000 operations.

So, (AB)C hence 4500 is minimum and that is the ans.

Input:
    arr: [10, 20, 30]

Output: 6000

Time Complexity: 0(n^2)

Space Complexity: 0(n^2)
*/

package DP.MatrixChainMultiplication;

import java.util.Arrays;

public class MatrixChainMultiplication {
    public int matrixChainMultiplication(int[] A){
        return matrixChainMultiplicationUtil(A, 1, A.length-1);
    }

    private int matrixChainMultiplicationUtil(int[] A, int i, int j){
        if(i >= j)
            return 0;

        int min = Integer.MAX_VALUE;

        for(int k = i; k < j; k++){
            int temp1 = matrixChainMultiplicationUtil(A, i, k);
            int temp2 = matrixChainMultiplicationUtil(A, k+1, j);

            /*
            Suppose for (AB)(CD)
            temp1 gives the ans of AB
            temp2 gives the ans of CD
            below expression calculates the remaining cost i.e (AB) * (CD)
            */
            int remainingCost = A[i-1] * A[k] * A[j];
            int cost = temp1 + temp2 + remainingCost;
            min = Math.min(min, cost);
        }

        return min;
    }

    public int matrixChainMultiplicationMemoized(int[] A){
        int[][] dp = new int[A.length][A.length];
        for(int[] a: dp)
            Arrays.fill(a, -1);

        return matrixChainMultiplicationMemoizedUtil(A, 1, A.length-1, dp);
    }

    private int matrixChainMultiplicationMemoizedUtil(int[] A, int i, int j, int[][] dp){
        if(i >= j)
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        int min = Integer.MAX_VALUE;

        for(int k = i; k < j; k++){
            int temp1 = matrixChainMultiplicationMemoizedUtil(A, i, k, dp);
            int temp2 = matrixChainMultiplicationMemoizedUtil(A, k+1, j, dp);

            /*
            Suppose for (AB)(CD)
            temp1 gives the ans of AB
            temp2 gives the ans of CD
            below expression calculates the remaining cost i.e (AB) * (CD)
            */
            int remainingCost = A[i-1] * A[k] * A[j];
            min = Math.min(min, temp1 + temp2 + remainingCost);
        }

        dp[i][j] = min;
        return min;
    }
}


/*
Calculations:
1, 4
 k = 1 -> 54000
 (1, 1) -> 0
 (2, 4) -> 48000
 remaining -> 6000(total -> 54000)
        k = 2                                     k=3
        (2, 2) -> 0                               (2, 3) -> 24000
        (3, 4) -> 36000                           (4, 4) -> 0
        remaining -> 18000 (total -> 54000)       remaining -> 24000(total -> 48000)
             (3, 4)
              k = 3
              (3, 3) -> 0
              (4, 4) -> 0
              remaining -> 36000
 k = 2
 (1, 2) -> 6000
 (3, 4) -> 36000
 remaining -> 9000(total -> 51000)

 k = 3
 30000
*/