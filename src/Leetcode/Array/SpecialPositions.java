/*
Problem : Given a rows x cols matrix mat, where mat[i][j] is either 0 or 1, return the number of special positions in mat.
A position (i,j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

Input: mat = [[1,0,0],
              [0,0,1],
              [1,0,0]]

Output: 1

Explanation: (1,2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.

Link : https://leetcode.com/problems/special-positions-in-a-binary-matrix/
 */

package Array;

public class SpecialPositions {
    public int numSpecial(int[][] mat) {
        int[] sumRow = new int[mat.length];
        int[] sumColumn = new int[mat[0].length];
        int count = 0;

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1)
                {
                    sumRow[i] ++;
                    sumColumn[j] ++;
                }
            }

        }
        for(int i=0; i<mat.length; i++){

            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 1 && sumRow[i] == 1 && sumColumn[j] == 1)
                    count++;
            }

        }

        return count;
    }
}
