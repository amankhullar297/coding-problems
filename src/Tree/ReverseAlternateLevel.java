package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseAlternateLevel {
	
	public static BinaryNode reverseAlternateLevel(BinaryNode root){
		int count=1;
		BinaryNode temp=root;
		Queue<BinaryNode> queue=new LinkedList<>();
		queue.offer(root);
		queue.offer(root.left);
		queue.offer(root.right);
		//BinaryNode temp;
		while(!queue.isEmpty()){
		temp=queue.poll();
		BinaryNode temp1=queue.poll();
		BinaryNode temp2=queue.poll();
		//temp=temp1;
		if(count%2==0){
		root.left=temp2;
		root.right=temp1;}
		if(temp1.left!=null && temp2.right!=null){
			queue.offer(temp1.left);
			queue.offer(temp2.right);
			queue.offer(temp2.left);
			queue.offer(temp1.right);
		}
	}return root;}

	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.root=new BinaryNode(1);
		binaryTree.insert(2);
		binaryTree.insert(3);
		binaryTree.insert(4);
		binaryTree.insert(5);
		binaryTree.insert(6);
		binaryTree.insert(7);
		binaryTree.insert(8);
		binaryTree.insert(9);
		binaryTree.insert(10);
		binaryTree.insert(11);
		binaryTree.insert(12);
		binaryTree.insert(13);
		binaryTree.insert(14);
		binaryTree.insert(15);
		BinaryNode temp=reverseAlternateLevel(binaryTree.root);
		List<Integer> list=LevelOrderTraversal.levelOrderTraversal(temp);
		for(int i:list){System.out.println(i);}
	}

}
