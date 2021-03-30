package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SpecialTree {

	public static BinaryNode specialTree(int[] pre,char[] preLn){
		BinaryTree bt=new BinaryTree();
		Queue<Integer> queue=new LinkedList<>();
		for(int i=0;i<pre.length;i++){
			if(preLn[i]=='N'){
				bt.insert(pre[i]);
			}
			else{
				queue.offer(pre[i]);
				System.out.println(pre[i]);
			}
		}
		while(!queue.isEmpty()){
			bt.insert(queue.poll());
		}
		return bt.root;
	}
	public static void main(String[] args) {
		int[] pre={10,30,20,5,15};
		char[] preLn={'N','N','L','L','L'};
		BinaryNode bt=specialTree(pre, preLn);
		//List<Integer> list=InOrderTraversal.inOrderWithoutRecur(bt);
		//System.out.println(list);
		LevelOrderTraversal.levelOrderTraversal(bt);
	}

}
