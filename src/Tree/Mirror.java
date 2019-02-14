package Tree;

public class Mirror {
	public static boolean isMirror(BinaryNode root){return isMirrorUtil(root.left, root.right);}
	public static boolean isMirrorUtil(BinaryNode left,BinaryNode right){
		if(left==null && right==null)return true;
		//if(left.data==right.data && left!=null && right!=null )return true;
		if( left!=null && right==null || left==null && right!=null )return false;
		if(left.data!=right.data)return false;
		return isMirrorUtil(left.left, right.right) && isMirrorUtil(left.right, right.left);
	}

	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.insert(12);
		binaryTree.insert(17);
		binaryTree.insert(17);
		binaryTree.insert(22);
		binaryTree.insert(22);
		binaryTree.insert(22);
		binaryTree.insert(22);
		binaryTree.insert(22);
		System.out.println(isMirror(binaryTree.root));
	}

}
