package Tree;

public class SpecialTree1 {
public static BinaryNode specialTree(int[] inOrder){
	BinaryNode temp=null;
	return specialTreeUtil(inOrder, 0, inOrder.length-1, null);
}
public static BinaryNode specialTreeUtil(int [] arr,int strt,int end,BinaryNode root){
	if(strt>end){return root;}
	int midIndex=findMax(arr, strt, end);	
root=new BinaryNode(arr[midIndex]);
root.left=specialTreeUtil(arr, strt, midIndex-1, root.left);
//System.out.println(root.left.data);
root.right=specialTreeUtil(arr, midIndex+1, end, root.right);
//System.out.println(root.right.data);
System.out.println(root.data);
return root;
}
	public static int findMax(int[] arr,int strt,int end){
		int max=0;
		for(int i=strt;i<=end;i++){
			if(arr[i]>arr[max])max=i;
		}
		//System.out.println(max);
	return max;}

public static void main(String[] args) {
		int[] arr={5,10,40,30,28};
		BinaryNode bt=specialTree(arr);
		System.out.println("level 1");
		LevelOrderTraversal.levelOrderTraversal(bt);
	}
}
