package BinarySearchTree;

import java.util.List;

public class BinarySearchTree {
	Node root;
	public void insert(int data){
	this.root=insertUtil(this.root, data);
	}


	public Node insertUtil(Node root,int data){
	if(root==null){
		root=new Node(data);
		return root;
		}

	 if(data<=root.data){
		root.left=insertUtil(root.left, data);
		}
	
	else if(data>root.data){
		root.right=insertUtil(root.right, data);
		}
	return root;
		}

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(12);
		bst.insert(15);
		bst.insert(1);
		bst.insert(40);
		bst.insert(90);
		InOrderTraversal.inOrder(bst.root);
		//List<Integer> list=LevelOrderTraversal.levelOrderTraversal(bst.root);
		//System.out.println(list);
	}

}
