package priorityqueue;

public abstract class AbstractQueue<E> implements Queue<E> {
	protected List<E> list;

	public AbstractQueue() {
		list = new LinkedList<E>();
	}

	public boolean isEmpty() { // O(1)

		if (list.size() > 0)
			return false;
		return true;
	}

}
