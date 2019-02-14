package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpecificLevelOrder {
	
	public static void specificLevelOroderTraversal(BinaryNode root){
	Queue<BinaryNode> queue=new LinkedList<>();
	queue.offer(root);
	queue.offer(null);
	BinaryNode temp1,temp2;
	while(!queue.isEmpty()){
		temp1=queue.poll();
		temp2=queue.poll();
		if(temp1!=null)
		System.out.print(temp1.data+"  ");
		if(temp2!=null)
		System.out.print(temp2.data+"  ");
		if(temp1!=null && temp1.left!=null)
			queue.offer(temp1.left);
		if(temp2!=null && temp2.right!=null)
			queue.offer(temp2.right);
		if(temp1!=null && temp1.right!=null)
			queue.offer(temp1.right);
		if(temp2!=null && temp2.left!=null)
			queue.offer(temp2.left);
		
	}
	}
	public static void reverseSpecificLevelOroderTraversal(BinaryNode root){
	Queue<BinaryNode> queue=new LinkedList<>();
	Stack<BinaryNode> stack= new Stack<>();
	stack.push(root);
	if(root.left!=null){stack.push(root.right);}
	if(root.right!=null){stack.push(root.left);}
	BinaryNode temp=root,temp1,temp2;
	//queue.add(temp);
	queue.offer(temp.left);
	queue.offer(temp.right);
	while(!queue.isEmpty()){
	temp1=queue.poll();
	temp2=queue.poll();
	stack.push(temp2.left);
	stack.push(temp1.right);
	stack.push(temp2.right);
	stack.push(temp1.left);
	if(temp1.left.left!=null && temp2.right.right!=null)
	{queue.offer(temp1.right);
		queue.offer(temp2.left);
	queue.offer(temp1.left);
	queue.offer(temp2.right);
	}
	}
	while(!stack.isEmpty()){
		System.out.print(stack.pop().data+"  ");
	}
	//System.out.print(root.data);
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
		binaryTree.insert(8);
		binaryTree.insert(9);
		binaryTree.insert(10);
		binaryTree.insert(11);
		binaryTree.insert(12);
		binaryTree.insert(13);
		binaryTree.insert(14);
		binaryTree.insert(15);
		reverseSpecificLevelOroderTraversal(binaryTree.root);
	}

}
