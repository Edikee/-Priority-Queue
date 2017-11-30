package priorityqueue;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private List<Integer> priority;
	private Integer priorityMinIndex;
	private int priorityMin;
	private Object lock = new Object();

	public PriorityQueue() {
		super();
		priority = new LinkedList<Integer>();
		priorityMinIndex = 0;
		priorityMin = Integer.MAX_VALUE;

	}

	@Override
	public boolean add(E obj) {

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) { // O(1)
		synchronized (lock) {

			list.add(obj);
			priority.add(priorityNumber);

			if (priorityMin > priorityNumber) {
				priorityMinIndex = 0;
				priorityMin = priorityNumber;
			} else {
				priorityMinIndex++;
			}
		}
		return true;
	}

	@Override
	public E getFirst() { // O(n)
		E value = null;
		synchronized (lock) {
			value = list.get(priorityMinIndex);

			list.remove(value);
			priority.removeIndexOf(priorityMinIndex);
			searchMin();
		}

		return value;
	}

	private void searchMin() { // O(n)
		priorityMin = Integer.MAX_VALUE;

		for (int i = 0; i < priority.size(); i++) {
			Integer tmp = priority.get(i);

			if (priorityMin >= tmp) {
				priorityMin = tmp;
				priorityMinIndex = i;
			}

		}

	}

	public void changePriority(E oldObj, E newObj, int priorit) { // O(n)

		synchronized (lock) {
			int index = list.indexOf(oldObj);
			if (list.remove(oldObj)) {
				priority.removeIndexOf(index);
				searchMin();
				this.add(newObj, priorit);
			}
		}
	}

}
