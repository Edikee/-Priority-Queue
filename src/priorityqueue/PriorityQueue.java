package priorityqueue;

import java.util.LinkedList;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private Object lock = new Object();
	private LinkedList<Integer> sortedListSet;

	public PriorityQueue() {
		sortedListSet = new LinkedList<Integer>();
	}

	@Override
	public boolean add(E obj) {

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) { 
		// O(log k) where k is the hashMap size
		synchronized (lock) {

			LinkedList<E> list = hashMap.get(priorityNumber);

			if (list == null) {
				list = new LinkedList<E>();
				hashMap.put(priorityNumber, list);

			}

			binaryAdd(priorityNumber, sortedListSet);
			list.addLast(obj);

		}

		return true;

	}

	@Override
	public E getFirst() { // O(1)

		E first = null;
		LinkedList<E> list = null;
		int minPriority;

		synchronized (lock) {

			minPriority = sortedListSet.getFirst();
			list = hashMap.get(minPriority);

			first = list.getFirst();
			list.removeFirst();

			if (list.size() == 0) {

				hashMap.remove(minPriority);
				sortedListSet.removeFirst();

			}
		}

		return first;

	}

	public boolean remove(int priority, E obj) {
		// O(log k) where k is the hashMap size

		LinkedList<E> list = null;
		boolean value = false;
		synchronized (lock) {

			list = hashMap.get(priority);
			value = list.remove(obj);

			if (list.size() == 0) {
				hashMap.remove(priority);
				binaryRemove(priority, sortedListSet);
			}
		}
		return value;
	}

	public void changePriority(E oldObj, int oldPriority, E newObj, int newPriorit) {
		// O(log k) where k is the hashMap size

		remove(oldPriority, oldObj);
		add(newObj, newPriorit);

	}

	public boolean binaryAdd(int key, LinkedList<Integer> list) {
		// O(log n)
		int low = 0;
		int high = list.size() - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (list.get(middle) == key) {
				return false;
			}
			if (list.get(middle) < key) {
				low = middle + 1;
			}
			if (list.get(middle) > key) {
				high = middle - 1;
			}
		}

		list.add(low, key);
		return true;

	}

	public boolean binaryRemove(int key, LinkedList<Integer> list) {
		// O(log n)
		int low = 0;
		int high = list.size() - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (list.get(middle) == key) {
				list.remove(middle);
				return true;
			}
			if (list.get(middle) < key) {
				low = middle + 1;
			}
			if (list.get(middle) > key) {
				high = middle - 1;
			}
		}

		return false;

	}
}
