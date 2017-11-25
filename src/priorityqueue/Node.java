package priorityqueue;

public class Node<E> {

	protected E contain;
	protected Node next;

	public void setNext(Node next) {
		this.next = next;
	}

	public void setContain(E contain) {
		this.contain = contain;
	}

	public Node getNext() {
		return next;
	}

	public E getContain() {
		return contain;
	}

}
