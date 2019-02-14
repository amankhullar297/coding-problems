package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
	public static void postOrderTraversalRecur(BinaryNode node){
		if(node==null)return;
		postOrderTraversalRecur(node.left);
		postOrderTraversalRecur(node.right);
		System.out.print(node.data+"  ");
	}
public static void postOderTraversalWithStacks(BinaryNode root){
	Stack<BinaryNode> stack1=new Stack<>();
	Stack<BinaryNode> stack2=new Stack<>();
	BinaryNode temp;
	stack1.push(root);
	while(!stack1.isEmpty()){
	temp=stack1.pop();
	stack2.push(temp);
	if(temp.left!=null){stack1.push(temp.left);}
	if(temp.right!=null){stack1.push(temp.right);}
	}
	while(!stack2.isEmpty()){System.out.print(stack2.pop().data+"  ");}
}
public static List<Integer> postOderTraversalWithOneStack(BinaryNode root){
	Stack<BinaryNode> stack=new Stack<>();
	List<Integer> list=new ArrayList<>();
	if(root==null)return list;
	stack.push(root);
	BinaryNode current=null,prev=null;
	while(!stack.isEmpty()){
		current=stack.peek();
		if(prev==null || prev.left==current || prev.right==current){
			if(current.left!=null){
			stack.push(current.left);
			}
			else if(current.right!=null){
				stack.push(current.right);
			}
			else{
				stack.pop();
				list.add(current.data);
			}
		}
		else if(current.left==prev){
			if(current.right!=null){
				stack.push(current.right);
			}
			else{
				stack.pop();
				list.add(current.data);
			}
		}
		else if(current.right==prev){
				stack.pop();
				list.add(current.data);
		}
		prev=current;
	}
	System.out.println(list);
	return list;
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
		postOrderTraversalRecur(binaryTree.root);
		System.out.println();
		postOderTraversalWithStacks(binaryTree.root);
		List<Integer> list=new ArrayList<>();
		list=postOderTraversalWithOneStack(binaryTree.root);
		System.out.println(list);
	}
}
