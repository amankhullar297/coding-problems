/*
Given a root node of binary tree, return the maximum sum of the path from one node to another node of tree.

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

public class NodeToNodeSum {
    int ans = Integer.MIN_VALUE;

    public int maxAnyNodeToAnyNodeSum(Node root){
        maxAnyNodeToAnyNodeSumUtil(root);
        return ans;
    }

    public int maxAnyNodeToAnyNodeSumUtil(Node root){
        if(root == null)
            return 0;

        int left = maxAnyNodeToAnyNodeSumUtil(root.left);
        int right = maxAnyNodeToAnyNodeSumUtil(root.right);

        int  temp = Math.max(Math.max(left, right) + root.val , root.val);
        int temp1 = Math.max(temp, left + right + root.val);
        ans = Math.max(ans, temp1);

        return temp;
    }
}
