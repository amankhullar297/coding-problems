/*
Given a root node of binary tree, return the diameter of given binary tree. The diameter of a tree is the number of nodes on the longest path between two leaves in the tree.

Approach: At each node, calculate the maximum by selecting max from left or right subtrees, or calculate the maximum by selecting left and right subtrees.

Input:
            1
          /   \
        2      3
      /  \
    4     5

Output: 4 (4-2-1-3)

Time Complexity: 0(n)

Space Complexity: 0(n)
*/

package DP.Trees;

public class Diameter {
     int ans = Integer.MIN_VALUE;

     public int getDiameter(Node root){
        getDiameterUtil(root);
        return ans;
    }

    private int getDiameterUtil(Node root){
        if(root == null)
            return 0;

        int left = getDiameterUtil(root.left);
        int right = getDiameterUtil(root.right);

        int  temp = Math.max(left, right) + 1;
        int temp1 = Math.max(temp, left + right + 1);
        ans = Math.max(ans, temp1);

        return temp;
    }
}
