package Tree;

public class Foldable {

	public static boolean isFoldable(BinaryNode root){
		return isFoldableUtil(root.left, root.right);
	}
	public static boolean isFoldableUtil(BinaryNode left,BinaryNode right){
		if(left==null && right ==null)
			return true;
		if(left!=null && right ==null || left==null && right !=null)
			return false;
		return (isFoldableUtil(left.left, right.right) && isFoldableUtil(left.right, right.left));
	}
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.root=new BinaryNode(2);
		binaryTree.insert(12);
		binaryTree.insert(17);
		binaryTree.insert(19);
		binaryTree.insert(21);
		binaryTree.insert(22);
		binaryTree.insert(24);
		binaryTree.insert(29);
		System.out.println(isFoldable(binaryTree.root));

	}

}
