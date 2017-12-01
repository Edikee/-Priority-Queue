package priorityqueue;

import java.util.ArrayList;

import javax.sound.midi.MidiChannel;

public class PriorityQueue<E> extends AbstractQueue<E> {

	private Object lock = new Object();
	private ArrayList<Integer> minIndexList;

	public PriorityQueue() {
		super();

		minIndexList = new ArrayList<Integer>();
	}

	private void minIndexListAdd(Integer priority) { // O(log n )
		int index = binarySearch(priority, minIndexList);
		minIndexList.add(index, priority);
	}

	private void minIndexListRemove(Integer priority) { // O(log n )
		int index = binarySearch(priority, minIndexList);
		minIndexList.remove(index);
	}

	@Override
	public boolean add(E obj) { // O(1)

		return add(obj, 1);
	}

	public boolean add(E obj, Integer priorityNumber) { // O(1)

		synchronized (lock) {

			List<?> tmpList = hashmap.get(priorityNumber);
			if (tmpList != null) {

				hashmap.get(priorityNumber).add(obj);

			} else {

				List<E> newList = new LinkedList<E>();
				newList.add(obj);
				hashmap.put(priorityNumber, newList);

			}
			minIndexListAdd(priorityNumber);
		}

		return true;
	}

	@Override
	public E getFirst() { // O(log n )
		E value = null;

		List<E> list = null;

		synchronized (lock) {

			list = hashmap.get(minIndexList.get(0));
			minIndexList.remove((Object) minIndexList.get(0));
			value = (E) list.get(list.size() - 1); // get the last object
			list.remove(value); // remove the object from the list

		}

		return value;

	}

	public void changePriority(E oldObj, int oldpriority, E newObj, int newpriorit) { // O(log
																						// n)

		synchronized (lock) {

			hashmap.get(oldpriority).remove(oldObj);

			minIndexListRemove(oldpriority);

		}
		add(newObj, newpriorit);

	}

	private int binarySearch(int key, ArrayList<Integer> tomb) {
		int low = 0;
		int high = tomb.size() - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (tomb.get(middle) == key) {
				return middle;
			}
			if (tomb.get(middle) < key) {
				low = middle + 1;
			}
			if (tomb.get(middle) > key) {
				high = middle - 1;
			}
		}
		return low;
	}

}
