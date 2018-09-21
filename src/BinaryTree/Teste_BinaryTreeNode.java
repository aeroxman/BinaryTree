package BinaryTree;

public class Teste_BinaryTreeNode {

	public static void main(String[] args) {

		BinaryTree x = new BinaryTree();
		x.insert_root(0);

		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n6 = new BinaryTreeNode(6);

		x.root.left = n1;
		x.root.right = n2;
		n2.left = n3;
		n2.right = n4;
		n3.left = n5;
		n3.right = n6;

		x.root.binaryPreorder();
		x.root.binaryPostorder();
		x.root.binaryInorder();
	}
}
