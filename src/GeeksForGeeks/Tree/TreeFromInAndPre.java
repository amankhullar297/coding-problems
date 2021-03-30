package Tree;

public class TreeFromInAndPre {
	static int incr=0;
	//BinaryTree btree=new BinaryTree();
	public static BinaryNode makeTree(int[] pre,int[]in,int strt,int end,BinaryTree btree){
		//btree.root=new BinaryNode(in[0]);
		BinaryNode temp=null;
		if(strt==end){
		 temp=new BinaryNode(pre[strt]);
		 return temp;}
		int index=searchIndex(in, strt, end,pre[incr++]);
		btree.insert(makeTree(pre, in, strt, index,btree).data);
		btree.insert(makeTree(pre, in, index+1, end,btree).data);
		return btree.root;
		
	}
	public static int searchIndex(int[] in,int strt,int end,int value){
		for(int i=0;i<in.length;i++){
			if(in[i]==value){//System.out.println(i);
			//System.out.println(value);
			return i;}
		}return 0;}
	

	public static void main(String[] args) {
int[] pre={1,2,4,5,3,6,7};
int[] in={4,2,5,1,6,3,7};
BinaryTree btree=new BinaryTree();
BinaryNode bt=makeTree(pre, in, 0, in.length-1,btree);
InOrderTraversal.inOrder(bt);
	}

}
