package Tree;

public class BinaryNode {
public BinaryNode left;
public int data;
public BinaryNode right;


public BinaryNode() {super();
this.left=null;
this.data = 0;
this.right=null;}
public BinaryNode(int data) {
	super();
	this.left=null;
	this.data = data;
	this.right=null;
}
public BinaryNode getLeft() {
	return left;
}
public void setLeft(BinaryNode left) {
	this.left = left;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public BinaryNode getRight() {
	return right;
}
public void setRight(BinaryNode right) {
	this.right = right;
}
@Override
public String toString() {
	return "BinaryNode [  data=" + data + "]";
}

}
