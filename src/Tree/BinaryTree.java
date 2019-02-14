package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	BinaryNode root;
	public void insert(int value){
		if(this.root==null){
			BinaryNode temp=new BinaryNode(value);
			System.out.println(value);
			this.root=temp;
			return;
		}

	Queue<BinaryNode> queue=new LinkedList<>();
	queue.add(this.root);
	while(!queue.isEmpty()){
		BinaryNode temp=queue.peek();
		queue.remove();
		if(temp.left==null){
			temp.left=new BinaryNode(value);
			System.out.println(temp.left.data+"Data inserted");
			break;
		}
		else {

			queue.add(temp.left);
		}
		
		if(temp.right==null){
			temp.right=new BinaryNode(value);
			System.out.println(temp.right.data+"Data inserted");
			break;
		}
		else{
			queue.add(temp.right);
		}
	}
	}
	
	
		public void delete(int value){
		BinaryNode dataToBeDeleted=null;
		Queue<BinaryNode> queue=new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty()){
			BinaryNode temp=queue.peek();
			queue.remove();
			if(temp.data==value){
			dataToBeDeleted=temp;	
			}
			if(temp.left==null ){
				if(dataToBeDeleted==null){System.out.println("Item doesnot exists");break;}
				dataToBeDeleted.data=temp.data;
				System.out.println(temp.data+"Data Deleted");
				queue.remove();
				temp=null;
				break;
			}
			else {

				queue.add(temp.left);
			}
			
			if(temp.right==null ){
				if(dataToBeDeleted==null){System.out.println("Item doesnot exists");break;}
				dataToBeDeleted.data=temp.left.data;
				System.out.println(temp.left.data+"Data Deleted");
				queue.remove();
				temp=null;
				break;
			}
			else{
				queue.add(temp.right);
			}
		}

	}
	
	public void inOrder(BinaryNode temp)
    {
		//BinaryNode temp=this.root;
        if (temp == null)
            return;
      
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
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
		binaryTree.inOrder(binaryTree.root);
		binaryTree.delete(11);
		binaryTree.inOrder(binaryTree.root);

	}

}
