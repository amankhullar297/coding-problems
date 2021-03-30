package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
	public static void reverseLevelOrderTraversal(BinaryNode root){
	Queue<BinaryNode> queue=new LinkedList<>();
	Stack<BinaryNode> stack=new Stack<>();
	queue.offer(root);
	while(!queue.isEmpty()){
		root=queue.poll();
		stack.push(root);
		if(root.right!=null){queue.offer(root.right);}
		if(root.left!=null){queue.offer(root.left);}
	}
	while(!stack.isEmpty()){
		//System.out.println("Enters");
		System.out.println(stack.pop().data);
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
		reverseLevelOrderTraversal(binaryTree.root);
	}

}
