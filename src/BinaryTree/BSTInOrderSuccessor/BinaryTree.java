package Pramp.BSTInOrderSuccessor;

public class BinaryTree {
        static Node head;

        Node insert(Node node, int data)
        {
            if (node == null) {
                return (new Node(data));
            }
            else {

                Node temp = null;

                if (data <= node.data) {
                    temp = insert(node.left, data);
                    node.left = temp;
                    temp.parent = node;
                }
                else {
                    temp = insert(node.right, data);
                    node.right = temp;
                    temp.parent = node;
                }

                return node;
            }
        }

        Node inOrderSuccessor(Node root, Node n)
        {

            if (n.right != null) {
                return minValue(n.right);
            }

            Node p = n.parent;
            while (p != null && n == p.right) {
                n = p;
                p = p.parent;
            }
            return p;
        }

        Node minValue(Node node)
        {
            Node current = node;

            while (current.left != null) {
                current = current.left;
            }
            return current;
        }
}
