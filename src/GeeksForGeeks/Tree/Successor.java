package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Successor {
	
	public static int findSuccessor(BinaryNode temp,int n){
		if(temp==null)return -1;
		Stack<BinaryNode> bn=new Stack<>();
		BinaryNode current=temp;
		boolean done=false;
		List<Integer> list=new ArrayList<>();
		while (!done) {
			if(current!=null){
			bn.push(current);
			current=current.left;
			}
			else{
				if(bn.isEmpty()){
					done=true;
				}
				else{
					current=bn.pop();
					list.add(current.data);
					current=current.right;
				}
			}
			
		}	list.add(-1);int loc=0;	
for(int i:list){if(i==n){ loc=list.indexOf(i);}}return list.get(loc+1);
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
		System.out.println(findSuccessor(binaryTree.root, 29));
	}
}
