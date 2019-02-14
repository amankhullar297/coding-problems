package Tree;

public class BorderTraversal {
	public static void traverseLeaves(BinaryNode root){
		if(root!=null){
			traverseLeaves(root.left);
			if(root.left==null && root.right==null){
				System.out.print(root.data+"  ");
			}
			traverseLeaves(root.right);
		}
	}
	public static void traverseLeft(BinaryNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data+"  ");
		traverseLeft(root.left);
	}
	public static void traverseRight(BinaryNode root){
		if(root==null){
			return;
		}
		traverseRight(root.right);
		System.out.print(root.data+"  ");
	}
	public static void diagonalTraversal(BinaryNode root){
		traverseLeft(root);
		traverseLeaves(root);
		traverseRight(root);
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
		diagonalTraversal(binaryTree.root);
	}

}
