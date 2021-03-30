package Tree;

public class TreeHeight {
	public static int findHeight(BinaryNode root){
		if(root==null)return 0;
		int lHeight=findHeight(root.left)+1;
		int rHeight=findHeight(root.right)+1;
		return (lHeight>rHeight)?lHeight:rHeight;
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
		System.out.println(findHeight(binaryTree.root));
	}

}
