//breadth first search aka level-order traversal in BST
package levelOrderTraversalBST;

import java.util.*;
import java.io.*;

class Node {

	Node left, right;
	int data;
	
	//constructors
	Node(int data) {
		this.data = data;
		left = right = null;
	}
	
	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class bfsBST {

	static void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node current = q.remove();
			System.out.print(current.data + " ");

			if (current.left != null) q.add(current.left);
			if (current.right != null) q.add(current.right);
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node curr;
			if (data <= root.data) {
				curr = insert(root.left, data);
				root.left = curr;
			} else {
				curr = insert(root.right, data);
				root.right = curr;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		Node root = null;
		while (T-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

}
