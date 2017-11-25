package priorityqueue;

public class LinkedList<E> extends List<E> {

	protected Node<E> head;

	public LinkedList() {
		super();
		head = new Node<E>();
		head.setNext(null);
		head.setContain(null);
	}

	public boolean add(E obj) {
		Node next = new Node();
		next.setContain(obj);
		next.setNext(head);
		head = next;
		length++;
		return true;
	}

	public boolean removeIndexOf(int index) {

		Node<E> curent = head;
		Node<E> previous = head;
		if (length < index || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			head = head.getNext();
		} else {
			while (index != 0) {
				previous = curent;
				curent = curent.getNext();
				index--;
			}
			previous.setNext(curent.getNext());
		}
		length--;
		return true;
	}

	public boolean remove(E obj) {
		Node<E> curent = head;
		Node<E> previous = null;

		if (head.getContain().equals(obj)) {
			head = head.getNext();
			length--;

			return true;
		} else {
			for (int i = 0; i < this.length; i++) {
				if (curent.getContain().equals(obj)) {
					previous.setNext(curent.getNext());
					length--;
					return true;
				}
				previous = curent;
				curent = curent.getNext();

			}
		}
		return false;
	}

	public E get(int index) {

		Node<E> curent = head;

		if (length < index || index < 0) {
			throw new IndexOutOfBoundsException();
		}

		while (index != 0) {
			curent = curent.getNext();
			index--;
		}

		return curent.getContain();
	}

	public int indexOf(E obj) {
		Node<E> curent = head;
		for (int i = 0; i <= this.length; i++) {

			if (curent.getContain().equals(obj))
				return i;
			curent = curent.getNext();
		}
		return -1;

	}

}
