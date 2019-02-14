package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
	public static void inOrder(BinaryNode temp)
    {
		//BinaryNode temp=this.root;
        if (temp == null)
            return;
      
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
	public static List<Integer> inOrderWithoutRecur(BinaryNode temp)
    {
		if(temp==null)return null;
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
			
		}		return list;
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
		/*binaryTree.inOrder(binaryTree.root);
		binaryTree.delete(19);
		binaryTree.inOrder(binaryTree.root);*/
		InOrderTraversal it=new InOrderTraversal();
		//it.inOrder(binaryTree.root);
		List<Integer> list=new ArrayList<>();
		list=it.inOrderWithoutRecur(binaryTree.root);
		System.out.println(list);
	}
}
