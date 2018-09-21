package arvoreApare;

public class Node_Tree {

	Integer item;
	Node_Tree parent;
	Node_Tree firstChild;
	Node_Tree next;

	public Node_Tree(Integer item) {
		this.item = item;
		this.parent = null;
		this.firstChild = null;
		this.next = null;
	}

	public Node_Tree parent() {
		if (this.parent == null) {
			return null;
		} else {
			return (this.parent);

		}
	}

	public void imprime_Parent() {
		if (this.parent != null) {
			System.out.println("Pai: " + this.parent.item);
		} else {
			System.out.println("este nó eh o root, nao tem pai...");
		}
	}

	public void imprimeFilhos() { /// perguntar se esta criando o filho e depois seguindo a lista para imprimir
		if (this.firstChild == null) {
			System.out.println("node nao tem filhos....");
		} else {
			Node_Tree trab = this.firstChild;

			while (trab != null) {
				System.out.println(trab.item);
				trab = trab.next;
			}
		}
	}

	public boolean isInternal() { ///// nao entendi oq eh ser um node interno
		if (this.firstChild != null) {
			return true;
		} else {
			return false;
		}
	}

	public int dept() {
		if (this.parent == null) {
			return 0;
		} else {
			return (1 + this.parent.dept()); //// nao entendi essa linha
		}
	}

	public int height() {
		if (this.firstChild == null) {
			return 0;
		}
		int h = 0;

		Node_Tree trab = this.firstChild;

		while (trab.next != null) {
			h = Math.max(h, trab.next.height());
			trab = trab.next;
		}

		return 1 + h;
	}

	public void preorder() {
		System.out.println(this.item);

		Node_Tree trab = this.firstChild;

		while (trab != null) {
			trab.preorder();
			trab = trab.next;
		}
	}
}
