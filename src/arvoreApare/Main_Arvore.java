package arvoreApare;

public class Main_Arvore {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.insert_root(0);
		
		Node_Tree n1 = new Node_Tree(1);
		Node_Tree n2 = new Node_Tree(2);
		Node_Tree n3 = new Node_Tree(3);
		Node_Tree n4 = new Node_Tree(4);
		Node_Tree n5 = new Node_Tree(5);
		
		tree.root.firstChild = n1;
		n1.parent = tree.root;
		n1.next = n2;
		
		n2.parent = tree.root;
		n2.next = n3;
		
		n3.parent = tree.root;
		
		n2.firstChild = n4;
		n4.parent = n2;
		
		n4.next = n5;
		n5.parent = n2;
		
		tree.root.preorder();
		System.out.println("");
	}

}
