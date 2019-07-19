package Tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class QTree{
	BinaryNode node;
	int id;
	public QTree(BinaryNode node, int id) {
		super();
		this.node = node;
		this.id = id;
	}
	public QTree() {this.node = null;}	
}

public class TreeTopView {
	
	public static void treeTopView(BinaryNode root){
		Queue<QTree> queue=new LinkedList<>();
		HashSet<Integer> hs=new HashSet<>();
		queue.offer(new QTree(root,1));
		while(!queue.isEmpty()){
		QTree qt=queue.poll();
		int id=qt.id;
		if(!hs.contains(qt.id)){
			System.out.print(qt.node.data+" ");
			hs.add(qt.id);
			}
		if(qt.node.left!=null){
			queue.offer(new QTree(qt.node.left,id-1));
			}
		if(qt.node.right!=null){
			queue.offer(new QTree(qt.node.right,id+1));
			}
		}
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
		treeTopView(binaryTree.root);
	}

}
