package CollectionExcercise;
class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}
public class Prb10_InorderTraversal {
	
		Node root;

		Prb10_InorderTraversal() {
			root = null;
		}

		void printInorder(Node node) {
			if (node == null)
				return;
			printInorder(node.left);
			System.out.print(node.key + " ");

			printInorder(node.right);
		}

		void printInorder() {
			printInorder(root);
		}

		public static void main(String[] args) {
			Prb10_InorderTraversal program10 = new Prb10_InorderTraversal();
			program10.root = new Node(1);
			program10.root.left = new Node(2);
			program10.root.right = new Node(3);
			program10.root.left.left = new Node(4);
			program10.root.left.right = new Node(5);

			System.out.println("\nInorder traversal of binary tree is ");
			program10.printInorder();
		}

	
}
