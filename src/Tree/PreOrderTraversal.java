package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
	 public static void preOrderTraversal(BinaryNode node){
		 if(node==null)
			 return;
		 System.out.println(node.data);
		 preOrderTraversal(node.left);
		 preOrderTraversal(node.right);
	 }
	 
	 public static List preOrderWithoutRecur(BinaryNode node){
		 Stack<BinaryNode> s=new Stack<>();
		 List<Integer> list=new ArrayList<>();
		 s.push(node);
		 while(!s.isEmpty()){
			 BinaryNode temp=s.pop();
			 list.add(temp.data);
			 if(temp.right!=null){
				s.push(temp.right); 
			 }
			 if(temp.left!=null){
					s.push(temp.left); 
				 }
		 }
		 return list;
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
		preOrderTraversal(binaryTree.root);
		List<Integer> list=preOrderWithoutRecur(binaryTree.root);
		System.out.println(list);
	}
}