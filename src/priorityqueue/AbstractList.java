package priorityqueue;

public abstract class AbstractList<E> implements List<E> {

	protected int length;

	public AbstractList() {
		length = 0;
	}

	public int size() { // O(1)
		return length;

	}

}
