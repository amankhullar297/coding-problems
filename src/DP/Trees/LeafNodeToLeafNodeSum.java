/*
Given a root node of binary tree, return the maximum sum of the path from one leaf node to another leaf node of tree.

Input:
           -10
           /  \
          9   20
              / \
            15   7

Output: 42 (15+20+7)

Time Complexity: 0(n)

Space Complexity: 0(n)
*/

package DP.Trees;

public class LeafNodeToLeafNodeSum {
    int ans = Integer.MIN_VALUE;

    public int maxLeafNodeToLeafNodeSum(Node root){
        maxLeafNodeToLeafNodeSumUtil(root);
        return ans;
    }

    public int maxLeafNodeToLeafNodeSumUtil(Node root){
        if(root == null)
            return 0;

        int left = maxLeafNodeToLeafNodeSumUtil(root.left);
        int right = maxLeafNodeToLeafNodeSumUtil(root.right);

        int temp = Math.max(left, right) + root.val;
        int temp1 = left + right + root.val;
        ans = Math.max(ans, temp1);

        return temp;
    }
}
