package Tree;

public class ModifiedLevelOrder {
	public static int findHeight(BinaryNode root){
		int lHeight,rHeight;
		if(root==null)return 0;
		else{
			lHeight=findHeight(root.left)+1;
			rHeight=findHeight(root.right)+1;
		}
		return (lHeight>rHeight)?lHeight:rHeight;
	}
	public static void modifiedLevelOrder(BinaryNode root){
		int height=findHeight(root);
		int count=0;
		boolean flag=true;
		for(int i=1;i<=height;i++){
			if(count==2) {flag=!flag;count=0;}
			modifiedLevelOrderDemo(root,i,flag);
			count++;
			//System.out.println(flag+" "+count);
			
		}
	}
	public static void modifiedLevelOrderDemo(BinaryNode root,int incr,boolean flag){
		if(root==null)return;
		if(incr==1){System.out.print(root.data);System.out.print("  ");}
		else if(flag){
			modifiedLevelOrderDemo(root.left, incr-1, flag);
			modifiedLevelOrderDemo(root.right, incr-1, flag);
		}
		else{
			modifiedLevelOrderDemo(root.right, incr-1, flag);
		modifiedLevelOrderDemo(root.left, incr-1, flag);}
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
		System.out.println(findHeight(binaryTree.root));
		modifiedLevelOrder(binaryTree.root);
	}

}
