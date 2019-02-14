package Tree;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.Vector;

public class DiagonalTraversal {
	public static void diagonalTraversal(BinaryNode root){
		HashMap<Integer,Vector<Integer>> hashMap=new HashMap<>();
		//diagonalTraversalUtil(root, 0, hashMap);
		hashMap=diagonalTraversalWithoutRecur(root);
		for(Entry<Integer,Vector<Integer>> entry:hashMap.entrySet()){
			System.out.println(entry);
		}
	}
	public static HashMap<Integer,Vector<Integer>> diagonalTraversalUtil(BinaryNode root,int index,HashMap<Integer,Vector<Integer>> hashMap){
		if(root==null)return null;
		Vector<Integer> temp=hashMap.get(index);
		if(temp==null){
			temp=new Vector<>();
			temp.add(root.data);
		}
		else{temp.addElement(root.data);}
		hashMap.put(index, temp);
		diagonalTraversalUtil(root.left, index+1, hashMap);
		diagonalTraversalUtil(root.right, index, hashMap);
		return hashMap;
	}
	public static HashMap<Integer,Vector<Integer>> diagonalTraversalWithoutRecur(BinaryNode root){
		HashMap<Integer, Vector<Integer>> hashMap=new HashMap<>();
		int incr=0;
		BinaryNode temp=root;
		boolean isDone=false;
		while(!isDone){
			
			while(temp!=null){
				//BinaryNode temp=root;
				Vector<Integer> vector=hashMap.get(incr);
				if(vector==null){
					vector=new Vector<>();
					vector.add(temp.data);
					hashMap.put(incr, vector);
					temp=temp.left;
					incr++;
					//System.out.println(temp.data);
				//	continue;
				}
				else{vector.add(temp.data);
				hashMap.put(incr, vector);
				temp=temp.left;
				incr++;
				//System.out.println(temp.data);
				}
			}	
			temp=root.right;
			root=root.right;
			incr=0;
			if(temp==null){isDone=!isDone;}
		}
			return hashMap;
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
		diagonalTraversal(binaryTree.root);


	}

}
