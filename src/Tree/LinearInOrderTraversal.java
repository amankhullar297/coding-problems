package Tree;

import java.util.ArrayList;
import java.util.List;

public class LinearInOrderTraversal {
	public static int findHeight(BinaryNode root){
		if (root==null){return 0;}
		int lHeight,rHeight;
		 lHeight=findHeight(root.left);
		 rHeight=findHeight(root.right);
		 return (lHeight>rHeight)?lHeight+1:rHeight+1;
		
	}
	public static void linearInOrderTraversal(BinaryNode root){
		int height=findHeight(root);
		for(int i=1;i<=height;i++){
			linearInOrderTraversalDemo(root,i);
		}
	}

	public static void linearInOrderTraversalDemo(BinaryNode root,int incr){
		if(root==null)return;
		if(incr==1)System.out.print(root.data);
		else {
			linearInOrderTraversalDemo(root.left, incr-1);
			linearInOrderTraversalDemo(root.right, incr-1);
		}
	}
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.root=new BinaryNode(1);
		binaryTree.insert(2);
		binaryTree.insert(3);
		binaryTree.insert(4);
		binaryTree.insert(5);
		binaryTree.insert(6);
		binaryTree.insert(7);
		List<Integer> list=new ArrayList<>();
		//list=spiralLevelOrderTraversal(binaryTree.root, 0);
		linearInOrderTraversal(binaryTree.root);
	}

}
