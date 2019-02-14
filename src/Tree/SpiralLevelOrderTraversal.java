package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SpiralLevelOrderTraversal {
	public static int findHeight(BinaryNode root){
		if (root==null){return 0;}
		int lHeight,rHeight;
		 lHeight=findHeight(root.left);
		 rHeight=findHeight(root.right);
		 return (lHeight>rHeight)?lHeight+1:rHeight+1;
		
	}
	
	public static void spiralLevelOrderRecurTraversal(BinaryNode root){
		int height=findHeight(root);
		int incr=1;boolean ltr=true;
		for(int i=1;i<=height;i++){
	spiralLevelOrderRecurTraversalDemo(root,i,ltr);
	ltr=!ltr;
	}}
	public static void spiralLevelOrderRecurTraversalDemo(BinaryNode root,int incr,boolean ltr){
	
	if(root==null)return;
	if(incr==1){System.out.println(root.data);}
	else if(!ltr){
		//incr++;
		spiralLevelOrderRecurTraversalDemo(root.left, incr-1,ltr);
		//System.out.println(root.data);
		spiralLevelOrderRecurTraversalDemo(root.right, incr-1,ltr);
	}
	else{
		//incr++;
		spiralLevelOrderRecurTraversalDemo(root.right, incr-1,ltr);
		//System.out.println(root.data);
	spiralLevelOrderRecurTraversalDemo(root.left, incr-1,ltr);}
	}

	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.root=new BinaryNode(1);
		//binaryTree.insert(1);
		binaryTree.insert(2);
		binaryTree.insert(3);
		binaryTree.insert(4);
		binaryTree.insert(5);
		binaryTree.insert(6);
		binaryTree.insert(7);
		List<Integer> list=new ArrayList<>();
		//list=spiralLevelOrderTraversal(binaryTree.root, 0);
		spiralLevelOrderRecurTraversal(binaryTree.root);
	}
}