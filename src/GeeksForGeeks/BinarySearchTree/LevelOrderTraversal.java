package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LevelOrderTraversal {
	public static List<Integer> levelOrderTraversal(Node node){
		Queue<Node> queue=new LinkedList<>();
		List<Integer> list=new ArrayList<>();
		queue.offer(node);
		Node temp=node;
		while(!queue.isEmpty()){
			temp=queue.poll();
			list.add(temp.data);
			if(temp.left!=null){
				queue.offer(temp.left);
			}
			if(temp.right!=null){
				queue.offer(temp.right);
			}
		}
		System.out.println(list);
		return list;
	}
}
