package BinarySearchTree;

import Tree.BinaryNode;

public class InOrderTraversal {
	public static void inOrder(Node temp)
    {
		//BinaryNode temp=this.root;
        if (temp == null)
            return;
      
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
}
