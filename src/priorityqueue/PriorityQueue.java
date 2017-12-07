package priorityqueue;

import java.util.LinkedList;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private Object lock = new Object();

	public PriorityQueue(int size) {
		super(size);

	}

	@Override
	public boolean add(E obj) {

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) {
		// Average-case complexity O(1)
		// Worst-case complexity O(n)

		synchronized (lock) {
			if (priorityNumber < 0) {

				throw new IndexOutOfBoundsException("PriorityNumber can't be negative");
			}

			if (priorityNumber > hashMap.size()) {

				this.reSize(priorityNumber + 1);
			}

			LinkedList<E> list = hashMap.get(priorityNumber);
			list.addLast(obj);
			elementsCount++;

		}

		return true;

	}

	@Override
	public E getFirst() {
		// O(1)

		E first = null;
		LinkedList<E> list = null;
		int minPriority = -1;
		int index = 0;

		synchronized (lock) {

			while (minPriority == -1) {
				if (hashMap.get(index).size() != 0) {

					minPriority = index;
				}

				index++;
			}

			list = hashMap.get(minPriority);
			first = list.getFirst();
			list.removeFirst();
			elementsCount--;

		}

		return first;

	}

	public boolean remove(int priority, E obj) {
		// O(1)

		LinkedList<E> list = null;
		boolean value = false;
		synchronized (lock) {

			list = hashMap.get(priority);
			value = list.remove(obj);
			elementsCount--;
		}

		return value;
	}

	public void changePriority(E oldObj, int oldPriority, E newObj, int newPriorit) {
		// O(1)

		remove(oldPriority, oldObj);
		add(newObj, newPriorit);

	}

}
