package priorityqueue;

public class Node<E> {

	protected E innerObject;
	protected Node next;

	public void setNext(Node next) {
		this.next = next;
	}

	public void setContain(E contain) {
		this.innerObject = contain;
	}

	public Node getNext() {
		return next;
	}

	public E getContain() {
		return innerObject;
	}

}
